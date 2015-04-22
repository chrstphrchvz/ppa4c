package exercise;

public class ExercisePrintf2 extends ExerciseTemplate {
	public ExercisePrintf2() {
		setLineArray(new Object[][] {

				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>int a = 5;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>double b = 6.7;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>char c = 'E';</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>char x[] = &quot;Hugh&quot;;</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(&quot;</code></html>",
						new Choice[] {
								new Choice("<html><code>%d</code></html>", true),
								new Choice("<html><code>%x</code></html>",
										false),
								new Choice("<html><code>%s</code></html>",
										false),
								new Choice("<html><code>%lf</code></html>",
										false),
								new Choice("<html><code>%c</code></html>",
										false) },
						"<html><code>&nbsp;</code></html>",
						new Choice[] {
								new Choice("<html><code>%d</code></html>",
										false),
								new Choice("<html><code>%x</code></html>",
										false),
								new Choice("<html><code>%s</code></html>",
										false),
								new Choice("<html><code>%lf</code></html>",
										true),
								new Choice("<html><code>%c</code></html>",
										false) },
						"<html><code>&nbsp;</code></html>",
						new Choice[] {
								new Choice("<html><code>%d</code></html>",
										false),
								new Choice("<html><code>%x</code></html>",
										false),
								new Choice("<html><code>%s</code></html>",
										false),
								new Choice("<html><code>%lf</code></html>",
										false),
								new Choice("<html><code>%c</code></html>", true) },
						"<html><code>\\n&quot;, a, b, c);</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(&quot;</code></html>",
						new Choice[] {
								new Choice("<html><code>%d</code></html>",
										false),
								new Choice("<html><code>%x</code></html>",
										false),
								new Choice("<html><code>%s</code></html>", true),
								new Choice("<html><code>%lf</code></html>",
										false),
								new Choice("<html><code>%c</code></html>",
										false) },
						"<html><code>&quot;, x);</code></html>" },

				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });

		setDescriptionPath("resources/Printf2/Description.html");
		setPseudocodePath("resources/Printf2/Pseudocode.txt");
		setGoodFeedbackPath("resources/Printf2/GoodFeedback.html");
		setBadFeedbackPath("resources/Printf2/BadFeedback.html");
	}
}
