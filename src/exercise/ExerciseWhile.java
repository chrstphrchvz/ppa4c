package exercise;

public class ExerciseWhile extends ExerciseTemplate {
	public ExerciseWhile() {
		setLineArray(new Object[][] {

				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>", },
				{ "<html><code> &nbsp int x=0; </code></html>" },
				{
						new Choice[] {
								new Choice("<html><code>do</code></html>",
										false),
								new Choice("<html><code>for</code></html>",
										false),
								new Choice("<html><code>while</code></html>",
										true) },
						"<html><code> (x &lt; 20) </code></html>" },
				{ "<html><code>&nbsp{</code></html>" },
				{
						"<html><code> &nbsp&nbsp if((x  </code></html>",
						new Choice[] {
								new Choice("<html><code> &lt; </code></html>",
										false),
								new Choice("<html><code> % </code></html>",
										true),
								new Choice("<html><code> + </code></html>",
										false) }, "<html><code> 2)==0)" },
				{ "<html><code> &nbsp&nbsp&nbsp&nbsp printf(\"%d \\n \"  ,x); </code></html>" },
				{
						"<html><code> &nbsp </code></html>",
						new Choice[] {
								new Choice("<html><code>x=x-1;</code></html>",
										false),
								new Choice("<html><code>x+=2;</code></html>",
										false),
								new Choice("<html><code>x=x+1;</code></html>",
										true) }, },
				{ "<html><code> &nbsp } <br> } </html></code>" } });

		setDescriptionPath("resources/Loops/Whileloops.htm");
		setPseudocodePath("resources/Loops/Pseudocode.txt");
		setGoodFeedbackPath("resources/Loops/GoodFeedback.html");
		setBadFeedbackPath("resources/Loops/BadFeedback.html");
	}
}
