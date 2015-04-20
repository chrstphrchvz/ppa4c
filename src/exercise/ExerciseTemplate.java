package exercise;

import java.util.ArrayList;

public class ExerciseTemplate {

	public static String[] getChoiceStrings(Choice[] c) {
		ArrayList<String> a = new ArrayList<String>();
		for (Choice b : c)
			a.add(b.getChoiceString());
		return (String[]) a.toArray(new String[a.size()]);
	}
	
	public static String wrapHTMLCode(String s) {
		return "<html><code>" + s + "</html></code>";
	}

	// local class
	public class Choice {
		private String choiceString;
		private boolean choiceIsCorrect;

		public String getChoiceString() {
			return choiceString;
		}

		public void setChoiceString(String choiceString) {
			this.choiceString = choiceString;
		}

		public boolean getChoiceIsCorrect() {
			return choiceIsCorrect;
		}

		public void setChoiceIsCorrect(boolean choiceIsCorrect) {
			this.choiceIsCorrect = choiceIsCorrect;
		}

		public Choice(String choiceString, boolean choiceIsCorrect) {
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

	private String descriptionPath, pseudocodePath, goodFeedbackPath,
			badFeedbackPath;

	public String getDescriptionPath() {
		return descriptionPath;
	}

	public void setDescriptionPath(String descriptionPath) {
		this.descriptionPath = descriptionPath;
	}

	public String getPseudocodePath() {
		return pseudocodePath;
	}

	public void setPseudocodePath(String pseudocodePath) {
		this.pseudocodePath = pseudocodePath;
	}

	public String getGoodFeedbackPath() {
		return goodFeedbackPath;
	}

	public void setGoodFeedbackPath(String goodFeedbackPath) {
		this.goodFeedbackPath = goodFeedbackPath;
	}

	public String getBadFeedbackPath() {
		return badFeedbackPath;
	}

	public void setBadFeedbackPath(String badFeedbackPath) {
		this.badFeedbackPath = badFeedbackPath;
	}
}
