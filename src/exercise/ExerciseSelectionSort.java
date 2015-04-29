package exercise;

public class ExerciseSelectionSort extends ExerciseTemplate {
	public ExerciseSelectionSort() {
		setLineArray(new Object[][] {

				{"<html><code>int main() </code></html>"},
				{"<html><code>{</code></html"},
				{"<html><code>         int index,x,y,temp; </code></html"},
				{"<html><code>         int n=10; </code></html"},
				{"<html><code>         int  </code></html",
				new Choice[]{
						new Choice( "<html><code> array; </html></code>",false),
				        new Choice( "<html><code> array[10]; </code></html",true),
				        new Choice( "<html><code> array[];",false)}},
				{"<html><code> for(int x=0; x<n; x++) </code></html>"},
				{"<html><code> { </code></html>"},
				{"<html><code>  &nbsp index =  </code></html"
					new Choice[]{
							new Choice( "<html><code> n; </html></code>",false),
					        new Choice( "<html><code> x; </code></html",true),
					        new Choice( "<html><code> y;",false)}},
				}
				{"<html><code> &nbsp for(int y=x; y<n; y++){ </code></html"},
				
				{"<html><code> &nbsp&nbsp&nbsp index = y;</code></html"},
				{"<html><code> &nbsp } </code></html"},
				{"<html><code>         int </code></html>",
					new Choice[]{
						new Choice( "<html><code> temp; </html></code>",true),
				        new Choice( "<html><code> x; </code></html",false),
				        new Choice( "<html><code> y;",false)}
				        "<html><code= array[x];       }</code></html"},
				
				{"<html><code> array[x] </code></html"
				    new Choice[]{
						new Choice( "<html><code> array[y]; </html></code>",false),
						new Choice( "<html><code> array[x]; </code></html",false),
						new Choice( "<html><code> array[index];",true)}},
				{"<html><code> array[index_of_min] = temp;</code></html"},
				{"<html><code> } </code></html"}});
				

					
		
		setDescriptionPath("resources/SelectionSort/Selection.htm");
		setPseudocodePath("resources/SelectionSort/SelectionPseudocode.txt");
		setGoodFeedbackPath("resources/SelectionSort/SelectionGoodFeedback.html");
		setBadFeedbackPath("resources/SelectionSort/SelectionBadFeedback.html");
		
	}
}
