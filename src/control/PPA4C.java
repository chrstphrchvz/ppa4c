package control;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import editor.EditorWindow;
public class PPA4C {

	public static void main(String[] args) {
		/* Code copied from 
		 * http://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html#programmatic
		 */
		try {
	            // Set cross-platform Java L&F (also called "Metal")
	        UIManager.setLookAndFeel(
	            UIManager.getCrossPlatformLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
		
		//Current task: prototype practice environment window
		EditorWindow.main(null);
	}

}
