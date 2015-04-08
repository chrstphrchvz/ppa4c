package exercise;

import exercise.ExerciseTemplate.Choice;

public class ExerciseConditionals extends ExerciseTemplate {
	public ExerciseConditionals() {
		setLineArray(new Object[][] {

				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>"},
				{ "<html><code>if(x </code></html>",
					new Choice[] {
						new Choice("<html><code>&gt;=</code></html>",
								true),
						new Choice(
								"<html><code>&lt;=</code></html>",
								false),
						new Choice(
								"<html><code>&gt;</code></html>",
								false),
					},
					"<html><code> 10)</code></html>"},
					{"<html><code>printf(\"%d \",x ); </code></html>"},
					
		});
		setDescriptionPath("src/resources/Conditionals/Conditionals.htm");
		setPseudocodePath("src/resources/Conditionals/Pseudocode.txt");
		setGoodFeedbackPath("src/resources/Conditionals/GoodFeedback.html");
		setBadFeedbackPath("src/resources/Conditionals/BadFeedback.html");
	}
}
