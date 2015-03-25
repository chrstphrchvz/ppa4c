package control;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.*;
import javax.swing.UnsupportedLookAndFeelException;

import exercise.ExerciseExample;
import exercise.ExerciseTemplate;
import exercise.ExerciseWindow;

public class PPA4C {

	public static void main(String[] args) {
		/*
		 * Code copied from
		 * http://docs.oracle.com/javase/tutorial/uiswing/lookandfeel
		 * /plaf.html#programmatic and
		 * http://docs.oracle.com/javase/tutorial/uiswing
		 * /lookandfeel/nimbus.html
		 */
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// If Nimbus is not available, you can set the GUI to another look and
		// feel.

		// Current task: prototype practice environment window
		// ExerciseWindow.main(new ExerciseExample());

		// Create exercise window using exercise name
		Class exerciseName;
		try {
			exerciseName = Class.forName(exercise.ExerciseExample.class
					.getName());// Moved from main() (created by WindowBuilder)
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ExerciseWindow frame = new ExerciseWindow(
								(ExerciseTemplate) exerciseName.newInstance());
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
