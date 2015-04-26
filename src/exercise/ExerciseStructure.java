package exercise;

public class ExerciseStructure extends ExerciseTemplate{
	public ExerciseStructure(){

		setLineArray(new Object[][] {
				//Begin C Struct-------------------------------------------------------------
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>&#09;</code></html>" /* empty line */},
				{ "<html><code>struct book {</code></html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>&#09;</code></html>", "<html><code>char *author;</code></html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>&#09;</code></html>", "<html><code>int lines; /*Total number of lines*/</code></html>"},
				{ "<html><code>&#09;};</code></html>"},
				//End C Struct----------------------------------------------------------------
				
				/*********************************************************************************/
				
				//Begin main loop---------------------------------------------------------------------------
				{ "<html><code>int main(void) {</code></html>" },
				{ "<html><code>&#09;</code></html>", "<html><code>struct book aeneid;</code><html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>struct book *aeneidPtr</code><html>"},
				{ "<html><code>&#09;</code></html>" /* empty line */},
	
				//The multiple choice mayhem begins anew. ------------------------------------------
				//First selection begin
				{ "<html><code>&#09;</code></html>", "<html><code>aeneid</code></html>", 
					new Choice[]{
						new Choice("<html><code>.author</code></html>",true),
						new Choice("<html><code>->author</code></html>", false),
						new Choice("<html><code>-author</code></html>", false)
						},
					"<html><code> = \"Virgil\"; /*Access through member operator</code></html>" 
				},
				//First selection end
				//-----------------------------------------------------------------------------
				{ "<html><code>&#09;</code></html>", "<html><code>&#09;aeneid.lines = 9896;</code></html>"},
				{ "<html><code>&#09;</code></html>", "<html><code>&#09;aeneidPtr = &amp;aenid;</code></html>"},
				{ "<html><code>&#09;</code></html>"}, //empty line
				//-----------------------------------------------------------------------------
				//Second selection begin
				{ "<html><code>&#09;</code></html>", "<html><code>printf( \"%s\\n%d\\n\", </code></html>", 
					new Choice[]{
						new Choice("<html><code>aeneid.author</code></html>",false),
						new Choice("<html><code>aeneid->author</code></html>", true),
						new Choice("<html><code>aeneid-author</code></html>", false)
						},
					"<html><code>, </code></html>",
				//Second selection end
				//-------------------------------------------------------------------------------
				//Third selection begin
					new Choice[]{
						new Choice("<html><code>aeneidPtr.lines</code></html>",false),
						new Choice("<html><code>aeneidPtr->lines</code></html>", true),
						new Choice("<html><code>aeneidPtr-lines</code></html>", false)
						},
					"<html><code>); /*Access through arrow operator*/</code></html>"
				},
				//Third selection end
				//-----------------------------------------------------------------------------
				{ "<html><code>&#09;</code></html>"}, //Empty line
				{ "<html><code>&#09;</code></html>","<html><code>return 0;</code></html>"},
				{ "<html><code>}</code></html>"}
		});
		
		String parentPath = "resources/Structures/";
		setDescriptionPath(parentPath + "Description.html");
		setPseudocodePath(parentPath + "Pseudocode.txt");
		setGoodFeedbackPath(parentPath + "GoodFeedback.html");
		setBadFeedbackPath(parentPath + "BadFeedback.html");
	}
}
