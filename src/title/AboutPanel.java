package title;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class AboutPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AboutPanel() {

		JLabel lblNewLabel = new JLabel(
				"<html>\n\t<head>\n\t\t<title></title>\n\t</head>\n\t<body>\n\t\t<h1>\n\t\t\tAbout PPA4C</h1>\n\t\t<p>\n\t\t\tPractice programming in C by reading pseudocode!</p>\n\t\t<p>\n\t\t\tEasy multiple-choice format with instant feedback!</p><p>Use the drop-down menus and click \"Check Work\"</p>\n<h2>Authors:</h2>\n<p>Alice, Bozo, Captain, Dr. Evil</p>\n<p>\n\t\t<i>\n\t\t\t(More information to be added&hellip;)</i></p\n\t</body>\n</html>\n");
		add(lblNewLabel);

	}

}
