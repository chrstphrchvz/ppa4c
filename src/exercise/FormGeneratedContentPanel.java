package exercise;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.BoxLayout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import exercise.ExerciseExample.Choice;

public class FormGeneratedContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FormGeneratedContentPanel(Object[][] lineArray) {
		linePanelArray = new ArrayList<JPanel>();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// parse lineArray
		// int answerIdx = 0;
		for (Object[] line : lineArray) {
			// parse line
			linePanelArray.add(new JPanel());
			linePanelArray.get(linePanelArray.size()-1).setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			for (Object segment : line) {
				// generate label from strings
				if (segment.getClass() == String.class.getClass()) {
					linePanelArray.get(linePanelArray.size()-1).add(new JLabel((String) segment));
				}
				// generate combobox from Choice[] and record correct answer
				else if (segment.getClass() == Choice[].class.getClass()) {
					//find and save the correct answer
					for (Choice c : (Choice[]) segment) {
						if (c.getChoiceIsCorrect()) {
							answerArray.add(c.getChoiceString());
						}
					}
					//create combobox from choices
					questionComboBoxArray.add(new JComboBox<String>(
							ExerciseExample
									.getChoiceStrings((Choice[]) segment)));
					linePanelArray.get(linePanelArray.size()-1).add(questionComboBoxArray.get(questionComboBoxArray.size()-1));
				}
				
			}
			
		}
		for (JPanel linePanel : linePanelArray)
			add(linePanel);
	}

	private ArrayList<JPanel> linePanelArray;
	// private Object[][] lineArray;
	private ArrayList<String> answerArray;
	private ArrayList<JComboBox<String>> questionComboBoxArray;
/*
	public boolean getGrade() {
		for (JComboBox<String> question : questionComboBoxArray)
			if (question.getSelectedItem() == answerArray.)
				return true;

	}*/
}
