package exercise;

import java.util.ArrayList;

public class ExerciseTemplate {

	public static String[] getChoiceStrings(Choice[] c) {
		ArrayList<String> a = new ArrayList<String>();
		for (Choice b : c)
			a.add(b.getChoiceString());
		return (String[]) a.toArray(new String[a.size()]);
	}

	// local class
	public class Choice {
		private String choiceString;
		private Boolean choiceIsCorrect;

		public String getChoiceString() {
			return choiceString;
		}

		public void setChoiceString(String choiceString) {
			this.choiceString = choiceString;
		}

		public Boolean getChoiceIsCorrect() {
			return choiceIsCorrect;
		}

		public void setChoiceIsCorrect(Boolean choiceIsCorrect) {
			this.choiceIsCorrect = choiceIsCorrect;
		}

		public Choice(String choiceString, Boolean choiceIsCorrect) {
			this.choiceString = choiceString;
			this.choiceIsCorrect = choiceIsCorrect;
		}
	}

	private Object[][] lineArray;

	public Object[][] getLineArray() {
		return lineArray;
	}

	public void setLineArray(Object[][] lineArray) {
		this.lineArray = lineArray;
	}
}
