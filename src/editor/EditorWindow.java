package editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EditorWindow extends JFrame 
	implements	ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorWindow frame = new EditorWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditorWindow() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        pseudocodeScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        formLabel = new javax.swing.JLabel();
        pseudocodeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Topic: Exercise 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addContainerGap(789, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jButton1.setText("Check work >>");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });

        jButton2.setText("<< Description");
        getContentPane().setLayout(new BorderLayout(0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("ToolTip.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("start\n   output to terminal \"Hello world!\"\n   report success to operating system\nfinish");
        pseudocodeScrollPane.setViewportView(jTextArea1);

        formLabel.setText("Your work:");

        pseudocodeLabel.setText("Pseudocode:");
        
        formPanel.setLayout(new BorderLayout(0, 0));
        formPanel.add(formLabel, BorderLayout.NORTH);
        
        splitPane = new JSplitPane();
        getContentPane().add(splitPane, BorderLayout.CENTER);
        
        JPanel pseudocodePanel = new JPanel();
        splitPane.setLeftComponent(pseudocodePanel);
        pseudocodePanel.setLayout(new BorderLayout(0, 0));
        getContentPane().add(jPanel4, BorderLayout.SOUTH);
        jPanel4.setLayout(new BorderLayout(0, 0));
        jPanel4.add(jButton2, BorderLayout.WEST);
        jPanel4.add(jButton1, BorderLayout.EAST);
        getContentPane().add(jPanel3, BorderLayout.NORTH);
        pseudocodePanel.add(pseudocodeScrollPane, BorderLayout.CENTER);
        pseudocodePanel.add(pseudocodeLabel, BorderLayout.NORTH);
        splitPane.setRightComponent(formPanel);
        
        formScrollPane = new JScrollPane();
        formPanel.add(formScrollPane, BorderLayout.CENTER);
        formSubPanel = new javax.swing.JPanel();
        
                formSubPanel.setBackground(java.awt.SystemColor.text);
                formSubPanel.setLayout(new BoxLayout(formSubPanel, BoxLayout.Y_AXIS));
                
                
                
                panel = new JPanel();
                FlowLayout flowLayout = (FlowLayout) panel.getLayout();
                flowLayout.setAlignment(FlowLayout.LEFT);
                formSubPanel.add(panel);
                jLabel6 = new javax.swing.JLabel();
                panel.add(jLabel6);
                
                        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
                        jLabel6.setText("#include <stdio.h>");
                        
                        panel_4 = new JPanel();
                        FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
                        flowLayout_1.setAlignment(FlowLayout.LEFT);
                        formSubPanel.add(panel_4);
                        jLabel2 = new javax.swing.JLabel();
                        panel_4.add(jLabel2);
                        
                                jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
                                jLabel2.setText("int main(void){");
                                
                                panel_1 = new JPanel();
                                FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
                                flowLayout_2.setAlignment(FlowLayout.LEFT);
                                formSubPanel.add(panel_1);
                                
                                label = new JLabel();
                                label.setText("    ");
                                label.setFont(new Font("Lucida Console", Font.PLAIN, 13));
                                panel_1.add(label);
                                jComboBox2 = new javax.swing.JComboBox();
                                panel_1.add(jComboBox2);
                                
                                        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "printf", "scanf" }));
                                        jComboBox2.setSelectedIndex(-1);
                                        jLabel3 = new javax.swing.JLabel();
                                        panel_1.add(jLabel3);
                                        
                                                jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
                                                jLabel3.setText("(\"Hello world!\");");
                                                
                                                panel_2 = new JPanel();
                                                FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
                                                flowLayout_3.setAlignment(FlowLayout.LEFT);
                                                formSubPanel.add(panel_2);
                                                
                                                label_1 = new JLabel();
                                                panel_2.add(label_1);
                                                label_1.setText("    ");
                                                label_1.setFont(new Font("Lucida Console", Font.PLAIN, 13));
                                                jLabel4 = new javax.swing.JLabel();
                                                panel_2.add(jLabel4);
                                                
                                                        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
                                                        jLabel4.setText("return 0;");
                                                        
                                                        panel_3 = new JPanel();
                                                        FlowLayout flowLayout_4 = (FlowLayout) panel_3.getLayout();
                                                        flowLayout_4.setAlignment(FlowLayout.LEFT);
                                                        formSubPanel.add(panel_3);
                                                        jLabel5 = new javax.swing.JLabel();
                                                        panel_3.add(jLabel5);
                                                        
                                                                jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
                                                                jLabel5.setText("}");
                                                                formScrollPane.setViewportView(formSubPanel);
                                                                
                                                                jButton1.addActionListener(this);
        pack();
	}
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel formLabel;
    private javax.swing.JLabel pseudocodeLabel;
    private javax.swing.JPanel formSubPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane pseudocodeScrollPane;
    private javax.swing.JTextArea jTextArea1;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JLabel label;
    private JLabel label_1;
    private Component verticalGlue;
    private JSplitPane splitPane;
    private JScrollPane formScrollPane;

	public void actionPerformed(ActionEvent e) {
		if (jComboBox2.getSelectedItem() == "printf")
		JOptionPane.showMessageDialog(null,
				"Great job!\n\n"
				+ "Program output:\n"
						+ "Hello World!",
						"Results",
						JOptionPane.INFORMATION_MESSAGE);
		else
		JOptionPane.showMessageDialog(null,
				"Try again!\n\n" 
				+ "Hint: printf() sends text to the user,\n"
				+ "while scanf() gets text from the user.",
				"Results",
				JOptionPane.ERROR_MESSAGE);
		}
}
