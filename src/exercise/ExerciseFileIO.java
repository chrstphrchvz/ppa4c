package exercise;

public class ExerciseFileIO extends ExerciseTemplate {
	public ExerciseFileIO() {
		setLineArray(new Object[][] {

				{ "<html><code>int main() </code></html>" },
				{ "<html><code>{ </code></html>" },
				{ new Choice[] {
						new Choice(
								"<html><code> File*somefile; </code></html>",
								true),
						new Choice("html><code> File somefile; </code></html>",
								false), } },
				{
						"<html><code>somefile= </code></html>",
						new Choice[] {
								new Choice("<html><code>fopen</html></code>",
										true),
								new Choice("<html><code>open</html></code>",
										false), },
						"<html><code>( \"..\\easyproblemFileI-O.txt\" </html></code>",
						new Choice[] {
								new Choice("<html><code>\"w\");</html></code>",
										true),
								new Choice(
										"<html><code>\"a,r\");</html></code>",
										false), } },

				{ "<html><code> </code></html>" },
				{
						new Choice[] {
								new Choice("<html><code>printf</html></code>",
										false),
								new Choice("<html><code>fprintf</html></code>",
										true),
								new Choice("<html><code>fscanf</html></code>",
										false),
								new Choice("<html><code>scanf</html></code>",
										false), },

						"<html><code> (somefile,'Testing'); </html></code>" },
				{ new Choice[] {
						new Choice(
								"<html><code>close(somefile);</html></code>",
								false),
						new Choice("<html><code>close;</html></code>", false),
						new Choice("<html><code>fclose;</html></code>", false),
						new Choice("<html><code>fclose(somefile);</html>", true), } },

				{ "<html><code>return(0); </code></html>" } });

		setDescriptionPath("resources/File I-O/File output/File I-O.html");
		setPseudocodePath("resources/File I-O/File output/Pseudo.txt");
		setGoodFeedbackPath("resources/File I-O/File output/rightanswer.html");
		setBadFeedbackPath("resources/File I-O/File output/wronganswer.html");

	}
}
