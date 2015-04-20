package exercise;

public class ExerciseFileInput extends ExerciseTemplate {
	public ExerciseFileInput() {
		setLineArray(new Object[][] {

				{ "<html><code>int main() </code></html>" },
				{ "<html><code>{ </code></html>" },
				{ new Choice[] {
						new Choice("<html><code> File *inputQ; </html></code>",
								true),
						new Choice("<html><code> File inputQ; </html></code>",
								false), } },
				{ new Choice[] {
						new Choice("<html><code>char input[80]</html></code>",
								false),
						new Choice("<html><code>char buff[]</html></code>",
								false),
						new Choice("<html><code>char buff[80]</html></code>",
								true) } },

				{
						"<html><code>inputQ= </code></html>",
						new Choice[] {
								new Choice("<html><code>fopen</html></code>",
										true),
								new Choice("<html><code>open</html></code>",
										false), },
						"<html><code>( \"Example.txt\" </html></code>",
						new Choice[] {
								new Choice("<html><code>\"w\");</html></code>",
										false),
								new Choice(
										"<html><code>\"a,r\");</html></code>",
										false),
								new Choice("<html><code>\"r\");</html></code>",
										true) } },

				{ "<html><code> </code></html>" },
				{
						"<html><code> while( </html></code>",
						new Choice[] {
								new Choice("<html><code>fputs</html></code>",
										false),
								new Choice("<html><code>fgets</html></code>",
										true), },
						"<html><code>(buff,80,inputQ) !=NULL);" },
				{ new Choice[] {
						new Choice(
								"<html><code>fprintf(\"%s\", buff); </html></code>",
								false),
						new Choice(
								"<html><code>fprint(\"%s\", buff); </html></code>",
								false),
						new Choice(
								"<html><code>printf(\"%s\", buff); </html></code>",
								true), } },

				{ new Choice[] {
						new Choice("<html><code>close(inputQ);</html></code>",
								false),
						new Choice(
								"<html><code>fclosef(inputQ);</html></code>",
								false),
						new Choice("<html><code>fclose(inputQ);</html></code>",
								true), } },

				{ "<html><code>return(0); </code></html>" } });

		setDescriptionPath("resources/File I-O/File input/Output.html");
		setPseudocodePath("resources/File I-O/File input/Pseudocode.txt");
		setGoodFeedbackPath("resources/File I-O/File input/rightanswer.html");
		setBadFeedbackPath("resources/File I-O/File input/badfeedback.html");

	}
}
