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

	private javax.swing.JLabel titleJLabel;
	private JPanel rightColumnPanel;
	private JPanel leftColumnPanel;
	private JLabel footerJLabel;
	private JPanel twoColumnPanel;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		setLayout(new BorderLayout(0, 0));
		footerJLabel = new JLabel("<html><h1>Click on a topic to begin</h1></html>");
		footerJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(footerJLabel, BorderLayout.SOUTH);

		setBackground(Color.WHITE);

		twoColumnPanel = new JPanel();
		add(twoColumnPanel, BorderLayout.CENTER);
		twoColumnPanel.setLayout(new BoxLayout(twoColumnPanel, BoxLayout.X_AXIS));
		twoColumnPanel.setOpaque(false);
		leftColumnPanel = new JPanel();
		twoColumnPanel.add(leftColumnPanel);
		leftColumnPanel.setOpaque(false);
		leftColumnPanel.setLayout(new BorderLayout(0, 0));
		ImageIcon flowerIcon = new ImageIcon(getClass().getClassLoader()
				.getResource("resources/Flower.gif"));
		JLabel flowerLabel = new JLabel(flowerIcon);
		leftColumnPanel.add(flowerLabel);

		rightColumnPanel = new JPanel();
		twoColumnPanel.add(rightColumnPanel);
		rightColumnPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		rightColumnPanel.setOpaque(false);
		titleJLabel = new JLabel(
				"<html><font face=\"Helvetica\" size=\"36\">Pseudocode<br>Programming<br>Assistant</font><br><font face=\"Times New Roman\" size=\"36\"><i>&nbsp;for</i> <b>C</b></font></html>");
		rightColumnPanel.setLayout(new BorderLayout(0, 0));
		rightColumnPanel.add(titleJLabel);

	}

}
