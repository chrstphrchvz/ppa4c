package exercise;

public class ExerciseIntro extends ExerciseTemplate {
	public ExerciseIntro() {
		setLineArray(new Object[][] {

				{
						"<html><code>&#09;</code></html>",
						new Choice[] {
								new Choice("<html><code>int</code></html>",
										true),
								new Choice("<html><code>double</code></html>",
										false),
								new Choice("<html><code>char</code></html>",
										false) },
						"<html><code> a = 9;</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						new Choice[] {
								new Choice("<html><code>int</code></html>",
										false),
								new Choice("<html><code>double</code></html>",
										true),
								new Choice("<html><code>char</code></html>",
										false) },
						"<html><code> b = 4.0;</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						new Choice[] {
								new Choice("<html><code>int</code></html>",
										false),
								new Choice("<html><code>double</code></html>",
										false),
								new Choice("<html><code>char</code></html>",
										true) },
						"<html><code> c = 'q';</code></html>" } });

		setDescriptionPath("resources/Intro/Description.html");
		setPseudocodePath("resources/Intro/Pseudocode.txt");
		setGoodFeedbackPath("resources/Intro/GoodFeedback.html");
		setBadFeedbackPath("resources/Intro/BadFeedback.html");
	}

}
