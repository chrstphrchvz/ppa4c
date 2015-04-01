package exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

//Should this be leftover as a test?
public class ExerciseWindow extends JFrame {

	/**
	 * Create the frame.
	 * 
	 * @param exerciseTemplate
	 */
	public ExerciseWindow(ExerciseTemplate exerciseTemplate) {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// exerciseTemplate refers to the specific exercise being used
		// (convert to constructor argument?)
		setContentPane(new ExerciseWindow(exerciseTemplate));

		pack();
	}

	
}
