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
		System.err.println("l23");
		linePanelArray = new ArrayList<JPanel>();
		questionComboBoxArray = new ArrayList<JComboBox<String>>();
		answerArray = new ArrayList<String>();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// parse lineArray
		for (Object[] line : lineArray) {
			System.err.println("l30");
			// parse line
			linePanelArray.add(new JPanel());
			linePanelArray.get(linePanelArray.size() - 1).setLayout(
					new FlowLayout(FlowLayout.LEFT, 5, 5));
			for (Object segment : line) {
				System.err.println("l36");
				// generate label from strings
				if (segment instanceof String) {
					System.err.println("l39");
					linePanelArray.get(linePanelArray.size() - 1).add(
							new JLabel((String) segment));
				}
				// generate combobox from Choice[] and record correct answer
				else if (segment instanceof Choice[]) {
					System.err.println("l45");
					// find and save EXACTLY 1 correct answer
					for (Choice c : (Choice[]) segment) {
						System.err.println("l48");
						if (c.getChoiceIsCorrect()) {
							System.err.println("l50" + c.getChoiceString());
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
			System.err.println("l65");
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
			if (questionComboBoxArray.get(i).getSelectedItem()
					.equals(answerArray.get(i)))
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