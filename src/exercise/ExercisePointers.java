package exercise;

import exercise.ExerciseTemplate.Choice;

public class ExercisePointers extends ExerciseTemplate {
	public ExercisePointers() {
		setLineArray(new Object[][] {

				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },
				{ "<html><code>&#09;int num;</code></html>" },
				{
						"<html><code>&#09;int</code></html>",
						new Choice[] {
								new Choice("<html><code></code></html>", false),
								new Choice("<html><code>*</code></html>", true),
								new Choice("<html><code>&amp;</code></html>",
										false) },
						"<html><code>num_ptr = </code></html>",
						new Choice[] {
								new Choice("<html><code></code></html>", false),
								new Choice("<html><code>*</code></html>", false),
								new Choice("<html><code>&amp;</code></html>",
										true) },
						"<html><code>num;</code></html>" },
				{
						"<html><code>printf(\" Value in num: %d \n\", </code></html>",
						new Choice[] { new Choice("",false) },
						"<html><code>);</code></html>" },
				{ "<html><code>(\"Hello world!\");</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });

		setTopic("Exercise ?");
		setDescriptionPath("PointersDescription.html");
		setPseudocodePath("PointersPseudocode.txt");
		setGoodFeedbackPath("src/exercise/GoodFeedback.html");
		setBadFeedbackPath("src/exercise/BadFeedback.html");
	}
}
