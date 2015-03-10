package exercise;

public class ExerciseExample extends ExerciseTemplate {
	public ExerciseExample() {
		setLineArray( // Line 1-3: array of strings
		new Object[][] {
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						// Line 4: array of segments (object[][] and string)

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
	}
}
