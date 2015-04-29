package exercise;

public class ExerciseBubbleSort extends ExerciseTemplate {
	public ExerciseBubbleSort() {
		setLineArray(new Object[][] {

				{"<html><code>int main() </code></html>"},
				{"<html><code>{</code></html"},
				{"<html><code>         int array[1000],x,y,n;</code></html"},
				{"<html><code>         bool swapMade;</code></html"},
				{"<html><code>         printf(\"Enter elements into array: \n\");</code></html"},
				{"<html><code>         scanf(\"%d\", &n);</code></html"},
				{"<html><code>         printf(\"Enter %d intergers \n\",n); </code></html"},
				{"<html><code>         for(x = 0; x < n ; x++){</code></html"},
				{"<html><code>                scanf(\"%d\", &array[x]);</code></html"},
				{"<html><code>                }</code></html"},
				{"<html><code>         do</code></html"},
				{"<html><code>         {</code></html"},
				{ new Choice[]{
						new Choice("<html><code>                   swapMade = true; </code></html>",false),
						new Choice("<html><code>               swapMade = false;</code></html",true),
				} },
				
				{"<html><code>               for(y = 0; y < n-1; y++)</code></html"},
				{"<html><code>               {</code></html"},
				
				{ new Choice[]{
						new Choice("if(array[y+1]>array[y])</code></html",false),
						new Choice("if(array[y]>array[y+1])</code></html",true),
				} },
				{"<html><code>                          {</code></html"},
				{"<html><code>                                      int swap = array[y+1];</code></html"},
				{"<html><code>                                      array[y+1] = array[y];</code></html"},
				{"<html><code>                                      array[y] = swap;</code></html"},
				{ new Choice[]{
						new Choice("<html><code>                                      swapMade = true;</code></html",true),
						new Choice("<html><code>                                      swapMade = false;</code></html",false),
				} },
				
				{"<html><code>                          }</code></html"},
				{"<html><code>                }</code></html"},
				{"<html><code>          }while(swapMade);</code></html"},
				{"<html><code>          printf(\"The bubble sorted bubble list of integers: \n\");</code></html"},
				{"<html><code></code></html"},
				{"<html><code>          for(y= 0; y<= n - 1; y++){</code></html"},
				{"<html><code>                printf(\"%d\n\", array[y]);</code></html"},
				{"<html><code>                }</code></html"},
				{"<html><code> system(\"PAUSE\");</code></html"},
				{"<html><code> return(0);</code></html"},
				{ "<html><code>}</code></html>" } });

		setDescriptionPath("resources/BubbleSort/BubbleSort.html");
		setPseudocodePath("resources/BubbleSort/BubblePseudo.txt");
		setGoodFeedbackPath("resources/BubbleSort/goodfeedback.html");
		setBadFeedbackPath("resources/BubbleSort/badfeedback.html");
		
	}
}