package exercise;

public class ExercisePrintf1 extends ExerciseTemplate {
	public ExercisePrintf1() {
		setLineArray(new Object[][] {

				// Line 1-2: array of strings
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },

				// Line 3: array of segments (object[][] and string)
				{ "<html><code>&#09;</code></html>",

						// question: array of [string/correct answer][choice]
						// EXACTLY ONE (1) CHOICE IS true!
						new Choice[] {
								new Choice("<html><code>scanf</code></html>",
										false),
								new Choice("<html><code>printf</code></html>",
										true) },

						"<html><code>(\"Hello world!\");</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });

		// setTopic("Exercise 1");
		setDescriptionPath("resources/Printf1/Description.html");
		setPseudocodePath("resources/Printf1/Pseudocode.txt");
		setGoodFeedbackPath("resources/Printf1/GoodFeedback.html");
		setBadFeedbackPath("resources/Printf1/BadFeedback.html");
	}
}
