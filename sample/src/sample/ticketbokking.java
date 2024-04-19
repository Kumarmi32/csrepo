package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticketbokking {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbokking window = new ticketbokking();
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
	public ticketbokking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 349, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" MOVIE TICKET BOKKING");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(92, 11, 194, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(22, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setBounds(22, 96, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf1 = new JTextField();
		tf1.setBackground(new Color(192, 192, 192));
		tf1.setBounds(135, 52, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(192, 192, 192));
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "DJ TILLU", "SALAR", "PROJECT K"}));
		cb1.setBounds(135, 92, 73, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NO OF TICKETS");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(22, 137, 103, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setForeground(new Color(0, 0, 0));
		cb2.setBackground(new Color(192, 192, 192));
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4"}));
		cb2.setBounds(135, 133, 73, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tf1.getText();
				String moviename=(String)cb1.getSelectedItem();
				String nooftickets=(String)cb2.getSelectedItem();
				int total=100*Integer.parseInt(nooftickets);
				
				
				
				JOptionPane.showConfirmDialog(btnNewButton, "NAME: "+name+"\n"
						+ "n MOVIE NAME :"+moviename+"\n NO OF TICKETS :"+nooftickets+"\n TOTAL :"+total);			
				
				
			}
			
			
			
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 128, 192));
		btnNewButton.setBounds(92, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\hh.jpg"));
		lblNewLabel_4.setBounds(0, -12, 330, 273);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
