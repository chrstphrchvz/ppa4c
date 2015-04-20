package title;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel {

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel jLabel2;
	private JPanel panel_2;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		setLayout(new BorderLayout(0, 0));
		jButton1 = new javax.swing.JButton();
		jLabel2 = new JLabel(
				"<html><h1>Click on a topic to begin</h1></html>");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		add(jLabel2, BorderLayout.SOUTH);

		setBackground(Color.WHITE);
		jButton1.setText("Begin");

		panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		panel_2.setOpaque(false);
		panel = new JPanel();
		panel_2.add(panel);
		panel.setOpaque(false);
		panel.setLayout(new BorderLayout(0, 0));
		ImageIcon flowerIcon = new ImageIcon(getClass().getClassLoader()
				.getResource("resources/Flower.gif"));
		JLabel flowerLabel = new JLabel(flowerIcon);
		panel.add(flowerLabel);

		panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setOpaque(false);
		jLabel1 = new JLabel(
				"<html><font face=\"Helvetica\" size=\"36\">Pseudocode<br>Programming<br>Assistant</font><br><font face=\"Times New Roman\" size=\"36\"><i>&nbsp;for</i> <b>C</b></font></html>");
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(jLabel1);

	}

}
