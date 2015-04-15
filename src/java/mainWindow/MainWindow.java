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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(0.0);
		leftComp = new topicBrowser.TopicBrowserPanel(this);
		leftComp.setPreferredSize(new Dimension(250,1000));
		rightComp = new title.TitlePanel();
		contentPane.add(splitPane, BorderLayout.CENTER);
		splitPane.setLeftComponent(leftComp);
		splitPane.setRightComponent(rightComp);
		setTitle("PPA4C");
		pack();
	}

	public void setExercise(ExerciseTemplate exerciseTemplate) {
		splitPane.remove(rightComp);
		rightComp = new ExercisePanel(exerciseTemplate);
		splitPane.setRightComponent(rightComp);
	}

}
