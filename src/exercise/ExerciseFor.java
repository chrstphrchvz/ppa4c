package exercise;

public class ExerciseFor extends ExerciseTemplate {
	public ExerciseFor() {
		setLineArray(new Object[][] {

				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>", },
				{ "<html><code> &nbsp int x; </cod></html>" },
				{ "<html><code> &nbsp int n; </code></html>" },
				{ "<html><code> &nbsp printf(\"n?\");</code></html>" },
				{ "<html><code> &nbsp scanf(\"%d\",&d);</code></html>" },
				{
						new Choice[] {
								new Choice("<html><code>do</code></html>",
										false),
								new Choice("<html><code>for</code></html>",
										true),
								new Choice("<html><code>while</code></html>",
										false) },
						"<html><code> (x=1; </code></html>",
						new Choice[] {
								new Choice(
										"<html><code> x &lt; n; </code></html>",
										false),
								new Choice(
										"<html><code> x &lt;= n; </code></html>",
										true),
								new Choice(
										"<html><code> x &gt; n; </code></html>",
										false) }, "x++)" },
				{ "<html><code> &nbsp&nbsp&nbsp&nbsp&nbsp printf(\"hello\"); </code></html>" },
				{ "<html><code> } </code></html>" } });

		setDescriptionPath("resources/Loops/Forloops.htm");
		setPseudocodePath("resources/Loops/ForPseudocode.txt");
		setGoodFeedbackPath("resources/Loops/ForGoodFeedback.html");
		setBadFeedbackPath("resources/Loops/ForBadFeedback.html");
	}
}
