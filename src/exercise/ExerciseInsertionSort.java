package exercise;

public class ExerciseInsertionSort extends ExerciseTemplate {
	public ExerciseInsertionSort() {
		setLineArray(new Object[][] {

				{"<html><code>int main() </code></html>"},
				{"<html><code>{</code></html"},
				{"<html><code>         int array[1000],x,y,z,n;</code></html"},

				{"<html><code>         printf(\"Enter elements into array: \n\");</code></html"},
				{"<html><code>         scanf(\"%d\", &n);</code></html"},
				{"<html><code>         printf(\"Enter %d intergers \n\",n); </code></html"},
				
				{"<html><code>         for(x = 0; x < n ; x++){</code></html"},
				{"<html><code>                scanf(\"%d\", &array[x]);</code></html"},
				{"<html><code>                }</code></html"},
				
				{"<html><code>         for(x = 1; x <= n-1 ; x++){</code></html"},
				{"<html><code>                y = x;</code></html"},

					
				{ new Choice[]{
						new Choice( "<html><code> for(y > 0 && array[y] < array[y-1]){ </html></code>",false),
				        new Choice( "<html><code>         while(y > 0 && array[y] < array[y-1]){</code></html",true),} },
				{"<html><code>               z = array[y];</code></html"}, 
				{"<html><code>               array[y] = array[y-1];</code></html"}, 
				{"<html><code>               array[y-1] = z;</code></html"}, 
				{"<html><code>                              </code></html"},
				{ new Choice[]{
						new Choice("<html><code> 			   z--; </code></html>",false),
						new Choice("<html><code> 			   x--; </code></html>",false),
						new Choice("<html><code>               y--;               </code></html",true),} },
				
				{"<html><code>                }</code></html"},
				{"<html><code>          }while(swapMade);</code></html"},
				{"<html><code>          printf(\"The Insertion sorted list of integers: \n\");</code></html"},
				{"<html><code></code></html"},
				{"<html><code>          for(x = 0; x <= n - 1; x++){</code></html"},
				{"<html><code>                printf(\"%d\n\", array[x]);</code></html"},
				{"<html><code>                }</code></html"},
				{"<html><code> system(\"PAUSE\");</code></html"},
				{"<html><code> return(0);</code></html"},
				{ "<html><code>}</code></html>" } });

		setDescriptionPath("resources/InsertionSort/InsertionSort.html");
		setPseudocodePath("resources/InsertionSort/InsertionPseudo.txt");
		setGoodFeedbackPath("resources/InsertionSort/goodfeedback.html");
		setBadFeedbackPath("resources/InsertionSort/badfeedback.html");
		
	}
}