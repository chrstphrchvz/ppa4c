package exercise;

import java.util.ArrayList;

public class ExerciseExample {
	// constants
	public static final int CHOICE_STRING = 0;
	public static final int CHOICE_CORRECT = 1;

	public static String[] getChoiceStrings(Choice[] c){
		ArrayList<String> a = new ArrayList<String>();
		for (Choice b: c) a.add(b.getChoiceString());
		return (String[]) a.toArray();
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
	

	private Object[][] lineArray = {
			// Line 1-3: array of strings
			{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
			{ "<html><code>int main(void) {</code></html>" },
			{ "<html><code>&#09;</code></html>" },
			// Line 4: array of segments (object[][] and string)
			{
					// question: array of [string/correct answer][choice]
				//EXACTLY ONE (1) CHOICE IS true!
					new Choice[] {
							new Choice("<html><code>scanf</code></html>", false),
							new Choice("<html><code>printf</code></html>", true) },
					"<html><code>(\"Hello world!\");</code></html>" },
			{ "<html><code>&#09;</code></html>" },
			{ "<html><code>return 0;</code></html>" },
			{ "<html><code>}</code></html>" } };

	public Object[][] getLineArray() {
		return lineArray;
	}

	public void setLineArray(Object[][] lineArray) {
		this.lineArray = lineArray;
	}
}
