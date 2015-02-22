package editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JEditorPane;

public class EditorWindow extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorWindow frame = new EditorWindow();
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
	public EditorWindow() {
		jPanel4 = new JPanel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		formTopPanel = new JPanel();
		pseudocodeScrollPane = new JScrollPane();
		formLabel = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Check work >>");

		jButton2.setText("<< Description");
		getContentPane().setLayout(new BorderLayout(0, 0));

		jPanel3 = new JPanel();
		jLabel1 = new JLabel();

		jLabel1.setText("Topic: Exercise 1");
		getContentPane().add(jPanel3, BorderLayout.NORTH);
		jPanel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		jPanel3.add(jLabel1);
		
		formLabel.setText("Your work:");

		formTopPanel.setLayout(new BorderLayout(0, 0));
		formTopPanel.add(formLabel, BorderLayout.NORTH);

		splitPane = new JSplitPane();
		getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel pseudocodeTopPanel = new JPanel();
		splitPane.setLeftComponent(pseudocodeTopPanel);
		pseudocodeTopPanel.setLayout(new BorderLayout(0, 0));
		getContentPane().add(jPanel4, BorderLayout.SOUTH);
		jPanel4.setLayout(new BorderLayout(0, 0));
		jPanel4.add(jButton2, BorderLayout.WEST);
		jPanel4.add(jButton1, BorderLayout.EAST);
		pseudocodeLabel = new JLabel();
		
				pseudocodeLabel.setText("Pseudocode:");
				pseudocodeTopPanel.add(pseudocodeLabel, BorderLayout.NORTH);
		pseudocodeTopPanel.add(pseudocodeScrollPane, BorderLayout.CENTER);
		
		pseudocodeInsidePanel = new JPanel();
		pseudocodeScrollPane.setViewportView(pseudocodeInsidePanel);
		pseudocodeInsidePanel.setLayout(new BorderLayout(0, 0));
		pseudocodeEditorPane = new JEditorPane();
		pseudocodeInsidePanel.add(pseudocodeEditorPane);
		pseudocodeEditorPane.setEditable(false);
		pseudocodeEditorPane.setBackground(UIManager.getDefaults().getColor(
				"ToolTip.background"));
		splitPane.setRightComponent(formTopPanel);

		formScrollPane = new JScrollPane();
		formTopPanel.add(formScrollPane, BorderLayout.CENTER);

		formStretchPanel = new JPanel();
		formScrollPane.setViewportView(formStretchPanel);
		formStretchPanel.setLayout(new BorderLayout(0, 0));
		formContentPanel = new JPanel();
		formStretchPanel.add(formContentPanel, BorderLayout.NORTH);

		formContentPanel.setBackground(java.awt.SystemColor.text);
		formContentPanel.setLayout(new BoxLayout(formContentPanel,
				BoxLayout.Y_AXIS));

		linePanel1 = new JPanel();
		formContentPanel.add(linePanel1);
		formContentPanel.add(Box.createVerticalStrut(0));
		linePanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		lineLabel1 = new JLabel();
		linePanel1.add(lineLabel1);

		lineLabel1
				.setText("<html><code>#include &lt;stdio.h&gt;</code></html>");
		linePanel2 = new JPanel();
		formContentPanel.add(linePanel2);
		formContentPanel.add(Box.createVerticalStrut(0));
		linePanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		lineLabel2 = new JLabel();
		linePanel2.add(lineLabel2);

		lineLabel2.setText("<html><code>int main(void){</code></html>");

		linePanel3 = new JPanel();
		formContentPanel.add(linePanel3);
		formContentPanel.add(Box.createVerticalStrut(0));
		linePanel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lineLabel3_1 = new JLabel();
		lineLabel3_1.setText("<html><code>&#09;</code></html>");
		linePanel3.add(lineLabel3_1);
		lineComboBox3_2 = new JComboBox<String>();
		linePanel3.add(lineComboBox3_2);

		lineComboBox3_2.setModel(new DefaultComboBoxModel<String>(new String[] {
				"<html><code>printf</code></html>",
				"<html><code>scanf</code></html>" }));
		lineComboBox3_2.setSelectedIndex(-1);
		lineLabel3_3 = new JLabel();
		linePanel3.add(lineLabel3_3);

		lineLabel3_3.setText("<html><code>(\"Hello world!\");</code></html>");

		linePanel4 = new JPanel();
		formContentPanel.add(linePanel4);
		formContentPanel.add(Box.createVerticalStrut(0));
		linePanel4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lineLabel4_1 = new JLabel();
		linePanel4.add(lineLabel4_1);
		lineLabel4_1.setText("<html><code>&#09;</code></html>");
		lineLabel4_2 = new JLabel();
		linePanel4.add(lineLabel4_2);

		lineLabel4_2.setText("<html><code>return 0;</code></html>");

		linePanel5 = new JPanel();
		formContentPanel.add(linePanel5);
		linePanel5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lineLabel5 = new JLabel();
		linePanel5.add(lineLabel5);

		lineLabel5.setText("<html><code>}</code></html>");

		/* Based on tutorial at 
		 * http://docs.oracle.com/javase/tutorial/uiswing/components/editorpane.html#editorpane
		 */
		java.net.URL pseudocodeURL = EditorWindow.class.getResource(
                "Pseudocode.txt");
		if (pseudocodeURL != null) {
		    try {
		        pseudocodeEditorPane.setPage(pseudocodeURL);
		    } catch (java.io.IOException e) {
		        System.err.println("Attempted to read a bad URL: " + pseudocodeURL);
		    }
		} else {
		    System.err.println("Couldn't find file: Pseudocode.txt");
		}

		
		formStretchPanel.add(Box.createVerticalGlue(), BorderLayout.CENTER);

		jButton1.addActionListener(this);
		
		
		pack();
	}

	private JButton jButton1;
	private JButton jButton2;
	private JComboBox<String> lineComboBox3_2;
	private JLabel jLabel1;
	private JLabel lineLabel2;
	private JLabel lineLabel3_3;
	private JLabel lineLabel4_2;
	private JLabel lineLabel5;
	private JLabel lineLabel1;
	private JLabel formLabel;
	private JLabel pseudocodeLabel;
	private JPanel formContentPanel;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel formTopPanel;
	private JScrollPane pseudocodeScrollPane;
	private JEditorPane pseudocodeEditorPane;
	private JPanel linePanel1;
	private JPanel linePanel3;
	private JPanel linePanel4;
	private JPanel linePanel5;
	private JPanel linePanel2;
	private JLabel lineLabel3_1;
	private JLabel lineLabel4_1;
	private JSplitPane splitPane;
	private JScrollPane formScrollPane;
	private JPanel formStretchPanel;
	private JPanel pseudocodeInsidePanel;

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
