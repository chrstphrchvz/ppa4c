package title;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel {

	private javax.swing.JLabel titleJLabel;
	private JPanel rightColumnPanel;
	private JPanel leftColumnPanel;
	private JPanel twoColumnPanel;
	private JPanel footerPanel;
	private JPanel topFooterPanel;
	private JPanel bottomFooterPanel;
	private JLabel footerJLabel1;
	private JLabel footerJLabel2;
	private JLabel footerJLabel3;
	private JLabel footerJLabel4;
	private JLabel footerJLabel5;
	private JLabel footerJLabel6;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		setLayout(new BorderLayout(0, 0));
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
		
		footerPanel = new JPanel();
		footerPanel.setLayout(new BoxLayout(footerPanel,BoxLayout.Y_AXIS));
		footerPanel.setOpaque(false);
		
		topFooterPanel = new JPanel();
		topFooterPanel.setLayout(new BoxLayout(topFooterPanel,BoxLayout.X_AXIS));
		topFooterPanel.setOpaque(false);
		footerPanel.add(topFooterPanel);
		
		bottomFooterPanel = new JPanel();
		bottomFooterPanel.setLayout(new BoxLayout(bottomFooterPanel,BoxLayout.X_AXIS));
		bottomFooterPanel.setOpaque(false);
		footerPanel.add(bottomFooterPanel);
		
		footerJLabel1 = new JLabel("<html><h2>Click on a&nbsp;</h2></html>");
		footerJLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		footerJLabel2 = new JLabel(UIManager.getIcon("Tree.leafIcon"));
		footerJLabel3 = new JLabel("<html><h2>&nbsp;to begin a topic</h2></html>");
		topFooterPanel.add(footerJLabel1);
		topFooterPanel.add(footerJLabel2);
		topFooterPanel.add(footerJLabel3);
		
		footerJLabel4 = new JLabel("<html><h2>Expand a&nbsp;</h2></html>");
		footerJLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
		footerJLabel5 = new JLabel(UIManager.getIcon("Tree.closedIcon"));
		footerJLabel6 = new JLabel("<html><h2>&nbsp;to show more topics</h2></html>");
		bottomFooterPanel.add(footerJLabel4);
		bottomFooterPanel.add(footerJLabel5);
		bottomFooterPanel.add(footerJLabel6);
		
		add(footerPanel, BorderLayout.SOUTH);

	}

}
