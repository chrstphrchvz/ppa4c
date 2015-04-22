package exercise;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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

		setExerciseTemplate(exerciseTemplate);

		/*
		 * Due to https://bugs.openjdk.java.net/browse/JDK-6789980, the
		 * background color of the pseudocode (from .txt) area cannot be changed
		 * when using Nimbus L&F.
		 */

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
		splitPane.setResizeWeight(0.5);
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
		splitPane.setDividerLocation(500);

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
		 */

		try {
			descriptionEditorPane.setPage(getClass().getClassLoader()
					.getResource(exerciseTemplate.getDescriptionPath()));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			pseudocodeEditorPane.setPage(getClass().getClassLoader()
					.getResource(exerciseTemplate.getPseudocodePath()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
		Icon messageIcon = null;

		if (formGeneratedContentPanel.getGrade()) {
			pathname = exerciseTemplate.getGoodFeedbackPath();
			messageType = JOptionPane.INFORMATION_MESSAGE;
			try {
				messageIcon = new ImageIcon(getClass().getClassLoader()
						.getResource((exerciseTemplate.getGoodIconPath())));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			pathname = exerciseTemplate.getBadFeedbackPath();
			messageType = JOptionPane.ERROR_MESSAGE;
			try {
				messageIcon = new ImageIcon(getClass().getClassLoader()
						.getResource((exerciseTemplate.getBadIconPath())));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		s = new Scanner(getClass().getClassLoader().getResourceAsStream(
				pathname));
		s.useDelimiter("\\Z");

		/*
		 * HTML formatted output is contained in new JLabel as workaround of
		 * https://bugs.openjdk.java.net/browse/JDK-8042134
		 */
		JOptionPane.showMessageDialog(null, new JLabel(s.next()), "Results",
				messageType, messageIcon);
		s.close();
	}

}
