package exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
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
		descriptionEditorPane.setContentType("text/html");
		descriptionScrollPane.setViewportView(descriptionEditorPane);

		practicePanel = new JPanel();
		tabbedPane.addTab("Practice", null, practicePanel, null);
		practicePanel.setLayout(new BorderLayout(0, 0));
		buttonPanel = new JPanel();
		practicePanel.add(buttonPanel, BorderLayout.SOUTH);
		checkWorkButton = new JButton();

		checkWorkButton.setText("Check work >>");
		buttonPanel.setLayout(new BorderLayout(0, 0));
		buttonPanel.add(checkWorkButton, BorderLayout.EAST);
		formTopPanel = new JPanel();
		pseudocodeScrollPane = new JScrollPane();
		formLabel = new JLabel();

		formLabel.setText("Your work:");

		formTopPanel.setLayout(new BorderLayout(0, 0));
		formTopPanel.add(formLabel, BorderLayout.NORTH);

		splitPane = new JSplitPane();
		practicePanel.add(splitPane);

		pseudocodeTopPanel = new JPanel();
		splitPane.setLeftComponent(pseudocodeTopPanel);
		pseudocodeTopPanel.setLayout(new BorderLayout(0, 0));
		pseudocodeLabel = new JLabel();

		pseudocodeLabel.setText("Pseudocode:");
		pseudocodeTopPanel.add(pseudocodeLabel, BorderLayout.NORTH);
		pseudocodeTopPanel.add(pseudocodeScrollPane, BorderLayout.CENTER);

		pseudocodeInsidePanel = new JPanel();
		pseudocodeScrollPane.setViewportView(pseudocodeInsidePanel);
		pseudocodeInsidePanel.setLayout(new BorderLayout(0, 0));
		pseudocodeEditorPane = new JEditorPane();
		pseudocodeInsidePanel.add(pseudocodeEditorPane, BorderLayout.CENTER);
		pseudocodeEditorPane.setEditable(false);
		pseudocodeEditorPane.setBackground(UIManager.getDefaults().getColor(
				"ToolTip.background"));
		splitPane.setRightComponent(formTopPanel);

		formScrollPane = new JScrollPane();
		formTopPanel.add(formScrollPane, BorderLayout.CENTER);

		formStretchPanel = new JPanel();
		formScrollPane.setViewportView(formStretchPanel);
		formStretchPanel.setLayout(new BorderLayout(0, 0));
		formGeneratedContentPanel = new FormGeneratedContentPanel(
				exerciseTemplate.getLineArray());
		formStretchPanel.add(formGeneratedContentPanel, BorderLayout.NORTH);

		checkWorkButton.addActionListener(this);

		/*
		 * Based on tutorial at
		 * http://docs.oracle.com/javase/tutorial/uiswing/components
		 * /editorpane.html#editorpane
		 */
		URL descriptionURL = ExerciseWindow.class.getResource(exerciseTemplate
				.getDescriptionPath());
		if (descriptionURL != null) {
			try {
				descriptionEditorPane.setPage(descriptionURL);
			} catch (java.io.IOException e) {
				System.err.println("Attempted to read a bad URL: "
						+ exerciseTemplate.getDescriptionPath());
			}
		} else {
			System.err.println("Couldn't find file: "
					+ exerciseTemplate.getDescriptionPath());
		}

		URL pseudocodeURL = ExerciseWindow.class.getResource(exerciseTemplate
				.getPseudocodePath());
		if (pseudocodeURL != null) {
			try {
				pseudocodeEditorPane.setPage(pseudocodeURL);
			} catch (java.io.IOException e) {
				System.err.println("Attempted to read a bad URL: "
						+ exerciseTemplate.getPseudocodePath());
			}
		} else {
			System.err.println("Couldn't find file: "
					+ exerciseTemplate.getPseudocodePath());
		}

	}

	public void setExerciseTemplate(ExerciseTemplate exerciseTemplate) {
		this.exerciseTemplate = exerciseTemplate;
	}

	private JButton checkWorkButton;
	private JLabel formLabel;
	private JLabel pseudocodeLabel;
	private JPanel buttonPanel;
	private JPanel formTopPanel;
	private JScrollPane pseudocodeScrollPane;
	private JEditorPane pseudocodeEditorPane;
	private JSplitPane splitPane;
	private JScrollPane formScrollPane;
	private JPanel formStretchPanel;
	private JPanel pseudocodeInsidePanel;
	private JTabbedPane tabbedPane;
	private JPanel practicePanel;
	private JScrollPane descriptionScrollPane;
	private JEditorPane descriptionEditorPane;
	private JPanel pseudocodeTopPanel;

	private ExerciseTemplate exerciseTemplate;
	private FormGeneratedContentPanel formGeneratedContentPanel;

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