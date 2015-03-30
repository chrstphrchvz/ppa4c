package title;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;

public class TitlePanel extends JPanel {

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel jLabel2;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		add(panel, BorderLayout.WEST);

		panel_1 = new JPanel();
		add(panel_1, BorderLayout.EAST);
		jButton1 = new javax.swing.JButton();
		/*
		 * jButton1.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent arg0) {
		 * this.setVisible(false); new TopicBrowserWindow().setVisible(true); }
		 * });
		 */
		jLabel1 = new JLabel("<html>"
				+ "<font face=\"Helvetica\" size=\"36\">Pseudocode<br>"
				+ "Programming<br>" + "Assistant</font><br>"
				+ "<font face=\"Times New Roman\" size=\"36\">"
				+ "<i>for</i><br>" + "C</font></html>");
		jLabel2 = new JLabel("<html><p align=\"center\">"
				+ "<i>Click on the </i><b>&gt;</b><i> to show topics</i>"
				+ "</p></html>");
		add(jLabel2, BorderLayout.SOUTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("<html><code>" + "/* insert flower here */"
				+ "</code></html>"));

		setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Begin");
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		panel_1.add(jLabel1);

	}

}
