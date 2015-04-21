package exercise;

public class ExercisePointers extends ExerciseTemplate {
	public ExercisePointers() {
		setLineArray(new Object[][] {

				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void) {</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>int num;</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>int </code></html>",
						new Choice[] {
								new Choice("<html><code>num_ptr</code></html>",
										false),
								new Choice(
										"<html><code>*num_ptr</code></html>",
										true),
								new Choice(
										"<html><code>&amp;num_ptr</code></html>",
										false) },
						"<html><code> = </code></html>",
						new Choice[] {
								new Choice("<html><code>num</code></html>",
										false),
								new Choice("<html><code>*num</code></html>",
										false),
								new Choice(
										"<html><code>&amp;num</code></html>",
										true) }, "<html><code>;</code></html>" },
				{ "<html><code>&#09;</code></html>",
						"<html><code>*num_ptr = 1852</code></html>" },
				{ "<html><code>&#09;</code></html>" /* empty line */},
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(\"Value in num: %d \\n\", </code></html>",
						new Choice[] {
								new Choice("<html><code>num</code></html>",
										true),
								new Choice("<html><code>*num</code></html>",
										false),
								new Choice(
										"<html><code>&amp;num</code></html>",
										false) },
						"<html><code>);</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(\"Address of num: %p \\n\", </code></html>",
						new Choice[] {
								new Choice("<html><code>num</code></html>",
										false),
								new Choice("<html><code>*num</code></html>",
										false),
								new Choice(
										"<html><code>&amp;num</code></html>",
										true) }, "<html><code>);</code></html>" },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(\"Value of num_ptr: %p \\n\", </code></html>",
						new Choice[] {
								new Choice("<html><code>num_ptr</code></html>",
										true),
								new Choice(
										"<html><code>*num_ptr</code></html>",
										false),
								new Choice(
										"<html><code>&amp;num_ptr</code></html>",
										false) } },
				{
						"<html><code>&#09;</code></html>",
						"<html><code>printf(\"Value pointed to by num_ptr: %d \\n\", </code></html>",
						new Choice[] {
								new Choice("<html><code>num_ptr</code></html>",
										false),
								new Choice(
										"<html><code>*num_ptr</code></html>",
										true),
								new Choice(
										"<html><code>&amp;num_ptr</code></html>",
										false) } },
				{ "<html><code>&#09;</code></html>",
						"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" } });

		String parentPath = "resources/Pointers/";
		setDescriptionPath(parentPath + "Description.html");
		setPseudocodePath(parentPath + "Pseudocode.txt");
		setGoodFeedbackPath(parentPath + "GoodFeedback.html");
		setBadFeedbackPath(parentPath + "BadFeedback.html");
		setBadIconPath(parentPath + "chan.png");
	}
}
