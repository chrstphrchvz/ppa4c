package exercise;

import exercise.ExerciseTemplate.Choice;

public class ExerciseSwitch extends ExerciseTemplate {
	public ExerciseSwitch() {
		setLineArray(new Object[][] {
				
				{ "<html><code>#include &lt;stdio.h&gt;</code></html>" },
				{ "<html><code>int main(void)</code></html>" },
				{ "<html><code>{</code></html>"},
				{ "<html><code>&#09;</code></html>",
					"<html><code>int weekday;</code></html>"},
				{ "<html><code>&#09;</code></html>",
					"<html><code>weekday = 5;</code></html>"},	
				//switch
				{ 	new Choice[] {
						new Choice("<html><code>&nbsp;</code></html>",
								false),
						new Choice("<html><code>switch</code></html>",
								true),
						new Choice(
								"<html><code>if</code></html>",
								false),
						new Choice(
								"<html><code>else</code></html>",
								false),
						new Choice(
								"<html><code>case</code></html>",
								false)}},
				{ "<html><code>{</code></html>"},
				//case1
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 1: printf(&quot;Monday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//case2
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 2: printf(&quot;Tuesday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//case3
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 3: printf(&quot;Wednesday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},				
				//case4
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 4: printf(&quot;Thusday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//case5
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 5: printf(&quot;Friday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//case6
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 6: printf(&quot;Saturday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//case7
				{	"<html><code>&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										false),
								new Choice(
										"<html><code>case</code></html>",
										true)},
					"<html><code> 7: printf(&quot;Sunday\\n&quot;);</code></html>",
					"<html><code>&#09;&#09;</code></html>",
							new Choice[] {
								new Choice("<html><code>&nbsp;</code></html>",
										false),
								new Choice(
										"<html><code>break;</code></html>",
										true),
								new Choice(
										"<html><code>case</code></html>",
										false)},},
				//default
				{	"<html><code>&#09;</code></html>",
					"<html><code>default: printf(&quot;Invalid weekday!&quot;);"
				},
				{ "<html><code>}</code></html>"},
				{ "<html><code>&#09;</code></html>",
				"<html><code>return 0;</code></html>" },
				{ "<html><code>}</code></html>" }
		});
		setDescriptionPath("src/resources/Conditionals/ConditionalsSwitch.htm");
		setPseudocodePath("src/resources/Conditionals/PseudocodeSwitch.txt");
		setGoodFeedbackPath("src/resources/Conditionals/GoodFeedback3.html");
		setBadFeedbackPath("src/resources/Conditionals/BadFeedback3.html");
	}
}
