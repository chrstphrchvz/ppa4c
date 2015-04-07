package exercise;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.border.TitledBorder;

public class ExercisePanel extends JPanel implements ActionListener {

	/**
	 * Create the panel.
	 */
	public ExercisePanel(ExerciseTemplate exerciseTemplate) {

		// setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// getContentPane().setLayout(new BorderLayout(0, 0));

		// exerciseTemplate refers to the specific exercise being used
		// (convert to constructor argument?)
		setExerciseTemplate(exerciseTemplate);

		// setTitle("Topic: " + exerciseTemplate.getTopic());

		/*
		 * Due to https://bugs.openjdk.java.net/browse/JDK-6789980, the
		 * background color of the pseudocode (from .txt) area cannot be changed
		 * when using Nimbus L&F.
		 */

		// getContentPane().add(exercisePanel, BorderLayout.CENTER);
		setLayout(new BorderLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);

		descriptionScrollPane = new JScrollPane();
		tabbedPane.addTab("Description", null, descriptionScrollPane, null);

		descriptionEditorPane = new JEditorPane();
		descriptionEditorPane.setEditable(false);
		descriptionEditorPane.setContentType("text/html");

		/*
		 * Hyperlink handling for JEditorPane
		 * http://stackoverflow.com/questions/3693543/hyperlink-in-jeditorpane
		 */
		descriptionEditorPane.addHyperlinkListener(new HyperlinkListener() {
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
					if (Desktop.isDesktopSupported()) {
						try {
							Desktop.getDesktop().browse(e.getURL().toURI());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});
		descriptionScrollPane.setViewportView(descriptionEditorPane);

		practicePanel = new JPanel();
		tabbedPane.addTab("Practice", null, practicePanel, null);
		practicePanel.setLayout(new BorderLayout(0, 0));
		buttonPanel = new JPanel();
		practicePanel.add(buttonPanel, BorderLayout.SOUTH);
		checkWorkButton = new JButton();

		checkWorkButton.setText("Check work");
		buttonPanel.setLayout(new BorderLayout(0, 0));
		buttonPanel.add(checkWorkButton, BorderLayout.EAST);
		formTopPanel = new JPanel();
		formTopPanel.setBorder(new TitledBorder(null, "Your work:",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pseudocodeScrollPane = new JScrollPane();

		formTopPanel.setLayout(new BorderLayout(0, 0));

		splitPane = new JSplitPane();
		practicePanel.add(splitPane);

		pseudocodeTopPanel = new JPanel();
		pseudocodeTopPanel.setBorder(new TitledBorder(null, "Pseudocode:",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane.setLeftComponent(pseudocodeTopPanel);
		pseudocodeTopPanel.setLayout(new BorderLayout(0, 0));
		pseudocodeTopPanel.add(pseudocodeScrollPane, BorderLayout.CENTER);

		pseudocodeEditorPane = new JEditorPane();
		pseudocodeEditorPane.setEditable(false);
		pseudocodeEditorPane.setBackground(UIManager.getDefaults().getColor(
				"ToolTip.background"));

		pseudocodeScrollPane.setViewportView(pseudocodeEditorPane);
		splitPane.setRightComponent(formTopPanel);

		formScrollPane = new JScrollPane();
		formTopPanel.add(formScrollPane, BorderLayout.CENTER);

		formSquishPanel = new JPanel();
		formScrollPane.setViewportView(formSquishPanel);
		formSquishPanel.setLayout(new BorderLayout(0, 0));
		formGeneratedContentPanel = new FormGeneratedContentPanel(
				exerciseTemplate.getLineArray());
		formSquishPanel.add(formGeneratedContentPanel, BorderLayout.NORTH);

		checkWorkButton.addActionListener(this);

		/*
		 * Based on tutorial at
		 * http://docs.oracle.com/javase/tutorial/uiswing/components
		 * /editorpane.html#editorpane
		 * 
		 * Revised to derive URL from java.io.File.
		 */

		try {
			descriptionEditorPane.setPage(new File(exerciseTemplate
					.getDescriptionPath()).toURI().toURL());
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			pseudocodeEditorPane.setPage(new File(exerciseTemplate
					.getPseudocodePath()).toURI().toURL());
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	public void setExerciseTemplate(ExerciseTemplate exerciseTemplate) {
		this.exerciseTemplate = exerciseTemplate;
	}

	private JButton checkWorkButton;
	private JPanel buttonPanel;
	private JPanel formTopPanel;
	private JScrollPane pseudocodeScrollPane;
	private JEditorPane pseudocodeEditorPane;
	private JSplitPane splitPane;
	private JScrollPane formScrollPane;
	private JTabbedPane tabbedPane;
	private JPanel practicePanel;
	private JScrollPane descriptionScrollPane;
	private JEditorPane descriptionEditorPane;
	private JPanel pseudocodeTopPanel;

	private ExerciseTemplate exerciseTemplate;
	private FormGeneratedContentPanel formGeneratedContentPanel;
	private JPanel formSquishPanel;

	public void actionPerformed(ActionEvent e) {

		Scanner s;
		String pathname;
		int messageType;

		if (formGeneratedContentPanel.getGrade()) {
			pathname = exerciseTemplate.getGoodFeedbackPath();
			messageType = JOptionPane.INFORMATION_MESSAGE;
		} else {
			pathname = exerciseTemplate.getBadFeedbackPath();
			messageType = JOptionPane.ERROR_MESSAGE;
		}

		try {
			s = new Scanner(new FileInputStream(new File(pathname)));
			s.useDelimiter("\\Z");

			/*
			 * HTML formatted output is contained in new JLabel as workaround of
			 * https://bugs.openjdk.java.net/browse/JDK-8042134
			 */
			JOptionPane.showMessageDialog(null, new JLabel(s.next()),
					"Results", messageType);
			s.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
