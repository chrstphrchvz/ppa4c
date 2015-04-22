package mainWindow;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import exercise.ExercisePanel;
import exercise.ExerciseTemplate;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private Component rightComp;
	private Component leftComp;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		setVisible(true);

		splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		leftComp = new topicBrowser.TopicBrowserPanel(this);
		leftComp.setPreferredSize(new Dimension(250, leftComp
				.getPreferredSize().height));
		leftComp.setMinimumSize(new Dimension(0,
				leftComp.getMinimumSize().height));
		rightComp = new title.TitlePanel();
		contentPane.add(splitPane, BorderLayout.CENTER);
		splitPane.setLeftComponent(leftComp);
		splitPane.setRightComponent(rightComp);

		splitPane.setDividerLocation(300);
		setTitle("PPA4C");
		pack();

		// http://stackoverflow.com/questions/479523/java-swing-maximize-window
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public void setExercise(ExerciseTemplate exerciseTemplate) {
		splitPane.remove(rightComp);
		rightComp = new ExercisePanel(exerciseTemplate);
		splitPane.setRightComponent(rightComp);
	}

}
