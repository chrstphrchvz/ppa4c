package exercise;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.util.ArrayList;

import javax.swing.JComboBox;

import exercise.ExerciseExample.Choice;

public class FormGeneratedContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FormGeneratedContentPanel(Object[][] lineArray) {
		linePanelArray = new ArrayList<JPanel>();
		questionComboBoxArray = new ArrayList<JComboBox<String>>();
		answerArray = new ArrayList<String>();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// parse lineArray
		for (Object[] line : lineArray) {
			// parse line
			linePanelArray.add(new JPanel());
			linePanelArray.get(linePanelArray.size() - 1).setLayout(
					new FlowLayout(FlowLayout.CENTER, 5, 5));
			for (Object segment : line) {
				// generate label from strings
				if (segment.getClass() == String.class.getClass()) {
					linePanelArray.get(linePanelArray.size() - 1).add(
							new JLabel((String) segment));
				}
				// generate combobox from Choice[] and record correct answer
				else if (segment.getClass() == Choice[].class.getClass()) {
					// find and save EXACTLY 1 correct answer
					for (Choice c : (Choice[]) segment) {
						if (c.getChoiceIsCorrect()) {
							answerArray.add(c.getChoiceString());
						}
					}
					// create combobox from choices
					questionComboBoxArray.add(new JComboBox<String>(
							ExerciseExample
									.getChoiceStrings((Choice[]) segment)));
					linePanelArray.get(linePanelArray.size() - 1).add(
							questionComboBoxArray.get(questionComboBoxArray
									.size() - 1));
				}
			}
		}
		for (JPanel linePanel : linePanelArray)
			add(linePanel);
	}

	private ArrayList<JPanel> linePanelArray;
	private ArrayList<String> answerArray;
	private ArrayList<JComboBox<String>> questionComboBoxArray;
	/*
	 * public boolean getGrade() { for (JComboBox<String> question :
	 * questionComboBoxArray) if (question.getSelectedItem() == answerArray.)
	 * return true;
	 * 
	 * }
	 */
}
