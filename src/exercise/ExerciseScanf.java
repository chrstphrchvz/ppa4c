package exercise;

public class ExerciseScanf extends ExerciseTemplate{
	public ExerciseScanf() {
		setLineArray(new Object[][] {
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },
				{ "<html><code>&#09;</code></html>", "<html><code>int x;</code><html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>char s[100];</code><html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>float y;</code></html>"},
				{ "<html><code>&#09;</code></html>" /* empty line */},
				//The multiple mayhem begins. ------------------------------------------------
				{ "<html><code>&#09;</code></html>", "<html><code>scanf( \"</code></html>", 
					new Choice[]{
						new Choice("<html><code>%lf</code></html>",false),
						new Choice("<html><code>%f</code></html>", false),
						new Choice("<html><code>%d</code></html>", true)
						},
					"<html><code>\", &amp;x); /*Store the integer*/</code></html>" 
				},
				//-----------------------------------------------------------------------------
				{ "<html><code>&#09;</code></html>", "<html><code>scanf( \"</code></html>",
					new Choice[]{
						new Choice("<html><code>%7s</code></html>",false),
						new Choice("<html><code>%7c</code></html>", true),
						new Choice("<html><code>%7a</code></html>", false)
					},
					"<html><code>\", s); /*Store 7 characters*/</code></html>"
				},
				//-----------------------------------------------------------------------------
				{ "<html><code>&#09;</code></html>", "<html><code>scanf( \"</code></html>", 
					new Choice[]{
						new Choice("<html><code>%lf</code></html>",false),
						new Choice("<html><code>%f</code></html>", true),
						new Choice("<html><code>%u</code></html>", false)
						},
					"<html><code>\", &amp;y); /*Store the float*/</code></html>"	
				},
				//-----------------------------------------------------------------------------
				{ "<html><code>&#09;</code></html>" /* empty line */},
				{ "<html><code>&#09;</code></html>","<html><code>return 0;</code></html>"},
				{ "<html><code>}</code></html>"}
		});
		
		String parentPath = "resources/scanf/";
		setDescriptionPath(parentPath + "Description.html");
		setPseudocodePath(parentPath + "Pseudocode.txt");
		setGoodFeedbackPath(parentPath + "GoodFeedback.html");
		setBadFeedbackPath(parentPath + "BadFeedback.html");
	}
}
