package exercise;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JComboBox;
import exercise.ExerciseTemplate.Choice;

public class FormGeneratedContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FormGeneratedContentPanel(Object[][] lineArray) {
		System.err.println("FGCP invoked");
		linePanelArray = new ArrayList<JPanel>();
		questionComboBoxArray = new ArrayList<JComboBox<String>>();
		answerArray = new ArrayList<String>();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// parse lineArray
		for (Object[] line : lineArray) {
			System.err.println("FGCP: Parsing line");
			// parse line
			linePanelArray.add(new JPanel());
			linePanelArray.get(linePanelArray.size() - 1).setLayout(
					new FlowLayout(FlowLayout.LEFT, 5, 5));
			for (Object segment : line) {
				System.err.println("FGCP: Parsing segment");
				// generate label from strings
				if (segment instanceof String) {
					System.err.println("FGCP: segment is String");
					linePanelArray.get(linePanelArray.size() - 1).add(
							new JLabel((String) segment));
				}
				// generate combobox from Choice[] and record correct answer
				else if (segment instanceof Choice[]) {
					System.err.println("FGCP: segment is Choice[]");
					// find and save EXACTLY 1 correct answer
					for (Choice c : (Choice[]) segment) {
						System.err.println("FGCP: Choice");
						if (c.getChoiceIsCorrect()) {
							System.err.println("FGCP: Correct distractor: " + c.getChoiceString());
							answerArray.add(c.getChoiceString());
						}
					}
					// create combobox from choices
					questionComboBoxArray.add(new JComboBox<String>(
							ExerciseTemplate
									.getChoiceStrings((Choice[]) segment)));
					// set default choice to -1 (blank)
					questionComboBoxArray.get(questionComboBoxArray.size() - 1)
							.setSelectedIndex(-1);
					linePanelArray.get(linePanelArray.size() - 1).add(
							questionComboBoxArray.get(questionComboBoxArray
									.size() - 1));
				}
			}
		}
		for (JPanel linePanel : linePanelArray) {
			System.err.println("FGCP: Adding linePanel");
			add(linePanel);
		}

	}

	private ArrayList<JPanel> linePanelArray;
	private ArrayList<String> answerArray;
	private ArrayList<JComboBox<String>> questionComboBoxArray;

	public boolean getGrade() {
		boolean a = true;
		for (int i = 0; i < questionComboBoxArray.size(); i++) {
			System.err.println("l77" + " "
					+ questionComboBoxArray.get(i).getSelectedItem() + " "
					+ answerArray.get(i));
			// Use null-safe equals method
			if (java.util.Objects.equals(questionComboBoxArray.get(i)
					.getSelectedItem(), (answerArray.get(i))))
				; // choice is correct, do nothing
			else {
				// choice is incorrect
				a = false;
				break;
			}
		}
		return a;
	}
}