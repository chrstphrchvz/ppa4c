package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JEditorPane;

import javax.swing.JTabbedPane;

public class ExerciseWindow extends JFrame implements ActionListener {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseWindow frame = new ExerciseWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExerciseWindow() {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		jPanel3 = new JPanel();
		jLabel1 = new JLabel();

		jLabel1.setText("Topic: Exercise 1");
		getContentPane().add(jPanel3, BorderLayout.NORTH);
		jPanel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		jPanel3.add(jLabel1);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		descriptionScrollPane = new JScrollPane();
		tabbedPane.addTab("Description", null, descriptionScrollPane, null);

			descriptionEditorPane = new JEditorPane();
			descriptionEditorPane.setContentType("text/html");
		descriptionScrollPane.setViewportView(descriptionEditorPane);

		practicePanel = new JPanel();
		tabbedPane.addTab("Practice", null, practicePanel, null);
		practicePanel.setLayout(new BorderLayout(0, 0));
		jPanel4 = new JPanel();
		practicePanel.add(jPanel4, BorderLayout.SOUTH);
		jButton1 = new JButton();

		jButton1.setText("Check work >>");
		jPanel4.setLayout(new BorderLayout(0, 0));
		jPanel4.add(jButton1, BorderLayout.EAST);
		formTopPanel = new JPanel();
		pseudocodeScrollPane = new JScrollPane();
		formLabel = new JLabel();

		formLabel.setText("Your work:");

		formTopPanel.setLayout(new BorderLayout(0, 0));
		formTopPanel.add(formLabel, BorderLayout.NORTH);

		splitPane = new JSplitPane();
		practicePanel.add(splitPane);

		JPanel pseudocodeTopPanel = new JPanel();
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
		new JPanel();
		//formStretchPanel.add(formContentPanel, BorderLayout.NORTH);
exerciseExample = new ExerciseExample();
formGeneratedContentPanel = new FormGeneratedContentPanel(exerciseExample.getLineArray());
formStretchPanel.add(formGeneratedContentPanel, BorderLayout.CENTER);



		jButton1.addActionListener(this);

		/*
		 * Based on tutorial at
		 * http://docs.oracle.com/javase/tutorial/uiswing/components/editorpane.html#editorpane
		 */
		java.net.URL descriptionURL = ExerciseWindow.class
				.getResource("Description.html");
		if (descriptionURL != null) {
			try {
				descriptionEditorPane.setPage(descriptionURL);
			} catch (java.io.IOException e) {
				System.err.println("Attempted to read a bad URL: "
						+ descriptionURL);
			}
		} else {
			System.err.println("Couldn't find file: Description.html");
		}
		
		java.net.URL pseudocodeURL = ExerciseWindow.class
				.getResource("Pseudocode.txt");
		if (pseudocodeURL != null) {
			try {
				pseudocodeEditorPane.setPage(pseudocodeURL);
			} catch (java.io.IOException e) {
				System.err.println("Attempted to read a bad URL: "
						+ pseudocodeURL);
			}
		} else {
			System.err.println("Couldn't find file: Pseudocode.txt");
		}

		pack();
	}

	private JButton jButton1;
	private JComboBox<String> lineComboBox3_2;
	private JLabel jLabel1;
	private JLabel formLabel;
	private JLabel pseudocodeLabel;
	private JPanel jPanel3;
	private JPanel jPanel4;
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
	
	private ExerciseExample exerciseExample;
	private FormGeneratedContentPanel formGeneratedContentPanel;

	public void actionPerformed(ActionEvent e) {
		if (lineComboBox3_2.getSelectedItem() == "<html><code>printf</code></html>")
			JOptionPane.showMessageDialog(null, "<html>" + "Great job!<br><br>"
					+ "Program output:<br>" + "<code>Hello World!</code>"
					+ "</html>", "Results", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "<html>" + "Try again!<br><br>"
					+ "Hint: <code>printf()</code> sends text to the user,<br>"
					+ "while <code>scanf()</code> gets text from the user."
					+ "</html>", "Results", JOptionPane.ERROR_MESSAGE);
	}
}
