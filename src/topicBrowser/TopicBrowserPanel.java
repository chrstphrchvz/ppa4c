package topicBrowser;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import mainWindow.MainWindow;
import exercise.ExerciseTemplate;
import javax.swing.border.TitledBorder;

public class TopicBrowserPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	// Local class
	public class Topic {
		public Topic(String topicNodeString, String topicClassString) {
			setTopicNodeString(topicNodeString);
			setTopicClassString(topicClassString);
		}

		private String topicNodeString;
		private String topicClassString;

		public void setTopicClassString(String topicClassString) {
			this.topicClassString = topicClassString;
		}

		public void setTopicNodeString(String topicNodeString) {
			this.topicNodeString = topicNodeString;
		}

		public String getTopicClassString() {
			return topicClassString;
		}

		public String getTopicNodeString() {
			return topicNodeString;
		}

		public String toString() {
			return getTopicNodeString();
		}

	}

	public TopicBrowserPanel(final MainWindow mainWindow) {
		setBorder(new TitledBorder(null, "Topics", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		setLayout(new BorderLayout(0, 0));
		jTree1 = new javax.swing.JTree();
		cRootTreeNode = new DefaultMutableTreeNode("C");
		DefaultMutableTreeNode node_1 = null;
		cRootTreeNode.add(new DefaultMutableTreeNode(
				new Topic("Intro/ReadMe to PPA4C", exercise.ExerciseIntro.class
						.getName())));
		node_1 = new DefaultMutableTreeNode("Input/Output");
		node_1.add(new DefaultMutableTreeNode(new Topic("Output: printf() 1",
				exercise.ExercisePrintf1.class.getName())));
		node_1.add(new DefaultMutableTreeNode(new Topic("Output: printf() 2",
				exercise.ExercisePrintf2.class.getName())));
		node_1.add(new DefaultMutableTreeNode("Input:     scanf()"));
		cRootTreeNode.add(node_1);
		node_1 = new DefaultMutableTreeNode("Conditional Constructs");
		node_1.add(new DefaultMutableTreeNode(new Topic("if",
				exercise.ExerciseConditionals.class.getName())));
		node_1.add(new DefaultMutableTreeNode(new Topic("if/else",
				exercise.ExerciseIfElse.class.getName())));
		node_1.add(new DefaultMutableTreeNode("switch"));
		cRootTreeNode.add(node_1);
		node_1 = new DefaultMutableTreeNode("Loops\t");
		node_1.add(new DefaultMutableTreeNode(new Topic("while",
				exercise.ExerciseWhile.class.getName())));
		node_1.add(new DefaultMutableTreeNode(new Topic("for",
				exercise.ExerciseFor.class.getName())));
		cRootTreeNode.add(node_1);
		cRootTreeNode.add(new DefaultMutableTreeNode(new Topic("Pointers",
				exercise.ExercisePointers.class.getName())));
		cRootTreeNode.add(new DefaultMutableTreeNode(new Topic("Arrays",
				exercise.ExerciseArray.class.getName())));
		cRootTreeNode.add(new DefaultMutableTreeNode(new Topic("Strings",
				exercise.ExerciseString.class.getName())));
		node_1 = new DefaultMutableTreeNode("Sorting");
		node_1.add(new DefaultMutableTreeNode("Search"));
		node_1.add(new DefaultMutableTreeNode("Bubble"));
		node_1.add(new DefaultMutableTreeNode("Insertion"));
		cRootTreeNode.add(node_1);
		node_1 = new DefaultMutableTreeNode("File I/O");
		node_1.add(new DefaultMutableTreeNode(new Topic("input",
				exercise.ExerciseFileInput.class.getName())));
		node_1.add(new DefaultMutableTreeNode(new Topic("output",
				exercise.ExerciseFileIO.class.getName())));
		cRootTreeNode.add(node_1);
		jTree1.setModel(new DefaultTreeModel(cRootTreeNode));
		jScrollPane2 = new javax.swing.JScrollPane(jTree1);
		add(jScrollPane2);
		jLabel1 = new javax.swing.JLabel();

		jLabel1.setText("Topics");

		// set Single Selection only
		jTree1.getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);

		// add TreeSelectionListener
		jTree1.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1
						.getLastSelectedPathComponent();
				if (node == null)
					return; /* Do Nothing */
				else
					System.out.println(node);
				if (node.getUserObject() instanceof Topic) {
					try {
						mainWindow.setExercise((ExerciseTemplate) Class
								.forName(
										((Topic) node.getUserObject())
												.getTopicClassString())
								.newInstance());
						mainWindow.setTitle("PPA4C - "
								+ ((Topic) node.getUserObject())
										.getTopicNodeString());
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			}
		});
	}

	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTree jTree1;
	private DefaultMutableTreeNode cRootTreeNode;

}
