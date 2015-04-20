package exercise;

public class ExerciseIfElse extends ExerciseTemplate {
	public ExerciseIfElse() {
		setLineArray(new Object[][] {

				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>int x1;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>int x2;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>x1 = 12;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>x2 = -3;</code></html>" },
				// if
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
										false),
								new Choice("<html><code>==</code></html>",
										false) },
						"<html><code> 0)</code></html>" },
				{ "<html><code>&#09;&#09;&#09;</code></html>",
						"<html><code>x1 = x1 - 2;</code></html>" },
				// else
				{ new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>if</code></html>", false),
						new Choice("<html><code>else</code></html>", true),
						new Choice("<html><code>switch</code></html>", false),
						new Choice("<html><code>case</code></html>", false) }, },
				{ "<html><code>&#09;&#09;&#09;</code></html>",
						"<html><code>x1 = -x1;</code></html>" },
				{ "<html><code>printf(&quot;Value of x1 = %d\\n&quot;, x1);</code></html>" },
				// if2
				{
						new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice("<html><code>else if</code></html>",
										false),
								new Choice("<html><code>else</code></html>",
										false),
								new Choice("<html><code>switch</code></html>",
										false),
								new Choice("<html><code>if</code></html>", true) },
						"<html><code>( x2 >= 0)</code></html>" },
				{ "<html><code>&#09;&#09;&#09;</code></html>",
						"<html><code>x2 = x2 - 2;</code></html>" },
				// else2
				{ new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>if</code></html>", false),
						new Choice("<html><code>else</code></html>", true),
						new Choice("<html><code>switch</code></html>", false),
						new Choice("<html><code>case</code></html>", false) }, },
				{ "<html><code>&#09;&#09;&#09;</code></html>",
						"<html><code>x2 = -x2;</code></html>" },
				{ "<html><code>printf(&quot;Value of x2 = %d\\n&quot;, x2);</code></html>" },

				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });
		setDescriptionPath("resources/Conditionals/Conditionals.htm");
		setPseudocodePath("resources/Conditionals/PseudocodeElse.txt");
		setGoodFeedbackPath("resources/Conditionals/GoodFeedback2.html");
		setBadFeedbackPath("resources/Conditionals/BadFeedback.html");
	}
}
