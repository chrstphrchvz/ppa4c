package exercise;

import exercise.ExerciseTemplate.Choice;

public class ExerciseString extends ExerciseTemplate {
	public ExerciseString() {
		setLineArray(new Object[][] {
				
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>void main (void)</code></html>" },
				{ "<html><code>{</code></html>" },
				{ "<html><code>int i;</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>char string[50]=</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>\"Hello World!\"</code></html>", true),
						new Choice("<html><code>Hello World!</code></html>", false),
						new Choice("<html><code>'Hello World!'	</code></html>", false),
				},
				"<html><code>;</code></html>",
				},
				
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>i=</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>stringlength(string)</code></html>", false),
						new Choice("<html><code>strlen(string)</code></html>", true),
						new Choice("<html><code>stln(string)</code></html>", false)},
				"<html><code>;</code></html>"},				
				
				{ "<html><code>;</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>printf(\"The string is: \n</code></html>" ,
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>%c</code></html>", false),
						new Choice("<html><code>#c</code></html>", false),
						new Choice("<html><code>%s</code></html>", true),
						new Choice("<html><code>#s</code></html>", false),
				},
				 "<html><code>\n\", string);</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>printf(\"The length of string is: %i\", i);</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>getche();</code></html>" },
				{ "<html><code>}</code></html>" },
		});
		setDescriptionPath("src/resources/String/Strings.htm");
		setPseudocodePath("src/resources/string/Pseudocode.txt");
		setGoodFeedbackPath("src/resources/string/GoodFeedback.html");
		setBadFeedbackPath("src/resources/string/BadFeedback.html");
	}
}
