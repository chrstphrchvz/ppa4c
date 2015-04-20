package exercise;

public class ExerciseConditionals extends ExerciseTemplate {
	public ExerciseConditionals() {
		setLineArray(new Object[][] {

				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>int x;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>x = 12;</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>if(x </code></html>",
						new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice("<html><code>&gt;=</code></html>",
										true),
								new Choice("<html><code>&lt;=</code></html>",
										false),
								new Choice("<html><code>&gt;</code></html>",
										false), },
						"<html><code> 10)</code></html>" },
				{ "<html><code>&#09;&#09;&#09;</code></html>",
						"<html><code>printf(\"Value of x: %d \",x ); </code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });
		setDescriptionPath("resources/Conditionals/Conditionals.htm");
		setPseudocodePath("resources/Conditionals/Pseudocode.txt");
		setGoodFeedbackPath("resources/Conditionals/GoodFeedback.html");
		setBadFeedbackPath("resources/Conditionals/BadFeedback.html");
	}
}
