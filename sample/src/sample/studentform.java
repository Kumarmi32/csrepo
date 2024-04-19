package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentform {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentform window = new studentform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 12));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tb1 = new JLabel("ROLL NO");
		tb1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tb1.setForeground(new Color(0, 255, 255));
		tb1.setBackground(new Color(0, 255, 255));
		tb1.setBounds(18, 50, 73, 14);
		frame.getContentPane().add(tb1);
		
		JLabel tb2 = new JLabel("NAME");
		tb2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tb2.setForeground(new Color(0, 255, 255));
		tb2.setBounds(18, 89, 73, 14);
		frame.getContentPane().add(tb2);
		
		textField = new JTextField();
		textField.setForeground(new Color(64, 0, 0));
		textField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField.setBackground(new Color(128, 128, 128));
		textField.setBounds(124, 47, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(64, 0, 0));
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setBackground(new Color(128, 128, 128));
		textField_1.setBounds(124, 86, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel cb2 = new JLabel("BRANCH");
		cb2.setForeground(new Color(0, 255, 255));
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		cb2.setBounds(18, 137, 73, 14);
		frame.getContentPane().add(cb2);
		
		lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setBounds(18, 174, 61, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(new Color(128, 128, 128));
		r1.setForeground(new Color(0, 0, 128));
		r1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		r1.setBounds(118, 170, 73, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(new Color(128, 128, 128));
		r2.setForeground(new Color(0, 0, 128));
		r2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		r2.setBounds(212, 170, 86, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMS");
		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(18, 208, 89, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(128, 128, 128));
		c1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		c1.setForeground(new Color(0, 0, 128));
		c1.setBounds(124, 204, 41, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(128, 128, 128));
		c2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		c2.setForeground(new Color(0, 0, 128));
		c2.setBounds(180, 204, 64, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(new Color(128, 128, 128));
		c3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		c3.setForeground(new Color(0, 0, 128));
		c3.setBounds(258, 204, 86, 23);
		frame.getContentPane().add(c3);
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setBackground(new Color(128, 128, 128));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "ECE", "EEE"}));
		cb1.setBounds(124, 134, 73, 20);
		frame.getContentPane().add(cb1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String)cb1.getSelectedItem();
				String gender="";
				String langs="";
				if(r1.isSelected())
				{
					gender="male";
					
				}
				if(r1.isSelected())
				{
					gender="female";
					
				}
				if(c1.isSelected())
				{
					langs=langs+"c ";
					
				}
				if(c2.isSelected())
				{
					langs=langs+" java";
					
				}
				if(c3.isSelected())
				{
					langs=langs+" python";
					
				}
				JOptionPane.showConfirmDialog(btnNewButton, "ROLL NO : "+roll+"\n NAME :"+name+"\n BRANCH :"+branch+"\n PROGRAMMS :"+langs);
					
				
				
				
			
			}
		});
		btnNewButton.setBounds(134, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_5 = new JLabel("STUDENT REGISTRATION");
		lblNewLabel_5.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(0, 255, 255));
		lblNewLabel_5.setBounds(119, 11, 198, 25);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
