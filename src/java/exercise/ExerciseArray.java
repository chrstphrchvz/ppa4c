package exercise;

import exercise.ExerciseTemplate.Choice;

public class ExerciseArray extends ExerciseTemplate {
	public ExerciseArray() {
		setLineArray(new Object[][] {
				
				{ "<html><code>#include&lt;stdio.h&gt;</code></html>" },
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>void main (void)</code></html>" },
				{ "<html><code>{</code></html>" },
				//problem 1
				{ "<html><code>int onedim</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>(5);</code></html>", false),
						new Choice("<html><code>[5];</code></html>", true),
						new Choice("<html><code>(5)</code></html>", false),
						new Choice("<html><code>[5]</code></html>", false),
				},
				},
				
				{ "<html><code>&#13;</code></html>" },
				{ "<html><code>onedim</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>[0]=1</code></html>", true),
						new Choice("<html><code>[1]=1</code></html>", false),
						new Choice("<html><code>=1</code></html>", false),
						new Choice("<html><code>(0)=1</code></html>", false),
				},
				"<html><code>;</code></html>",
				},
				
				{ "<html><code>onedim</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>[1]=2</code></html>", true),
						new Choice("<html><code>[2]=2</code></html>", false),
						new Choice("<html><code>=2</code></html>", false),
						new Choice("<html><code>(1)=2</code></html>", false),
				},
				"<html><code>;</code></html>",
				},
				
				{ "<html><code>onedim</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>[2]=3</code></html>", true),
						new Choice("<html><code>[3]=3</code></html>", false),
						new Choice("<html><code>=3</code></html>", false),
						new Choice("<html><code>(2)=3</code></html>", false),
				},
				"<html><code>;</code></html>",
				},				
				{ "<html><code>&#13;</code></html>" },
				
				{ "<html><code>int onedim</code></html>",
					new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>", false),
						new Choice("<html><code>(5)(5)</code></html>", false),
						new Choice("<html><code>[5,5]</code></html>", false),
						new Choice("<html><code>(5,5)</code></html>", false),
						new Choice("<html><code>[5][5]</code></html>", true),
				},
				"<html><code>;</code></html>",
				},				
				{ "<html><code>getche();</code></html>" },
				{ "<html><code>}</code></html>" },
		});
		setDescriptionPath("src/resources/Arrays/Arrays.htm");
		setPseudocodePath("src/resources/Arrays/Pseudocode.txt");
		setGoodFeedbackPath("src/resources/Arrays/GoodFeedback.html");
		setBadFeedbackPath("src/resources/Arrays/BadFeedback.html");
	}
}
