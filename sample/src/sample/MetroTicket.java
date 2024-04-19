package SAMPLE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicket {

	private JFrame frame;
	private JTextField tf;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) Exception {
		/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicket window = new MetroTicket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the application.
	 */
	public MetroTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(134, 11, 213, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(102, 0, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(92, 51, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setForeground(new Color(102, 0, 255));
		lblNewLabel_2.setBounds(92, 99, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(92, 148, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TCKTS");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(58, 200, 121, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tf = new JTextField();
		tf.setBounds(182, 48, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SAINIKPURI", "RADHIKA", "ECIL"}));
		cb1.setBounds(180, 95, 88, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SAINIKPURI", "RADHIKA", "ECIL"}));
		cb2.setBounds(180, 144, 88, 22);
		frame.getContentPane().add(cb2);
		
		tf1 = new JTextField();
		tf1.setBounds(182, 197, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\abstract-low-polygonal-metro-train-black-background-95337520.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(51, 255, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tf.getText();
				String src=(String)cb1.getSelectedItem();
				String dest=(String)cb2.getSelectedItem();
				String tkt = tf1.getText();
				int nt = Integer.parseInt(tkt);
				int bill=0;
				if(src.equals(dest)) {
					JOptionPane.showMessageDialog(btnNewButton,"Please check the source or destination.");
				}
				else {
					int res = 1;
					if(src.equals("SAINIKPURI")&&dest.equals("RADHIKA")||src.equals("RADHIKA")&&dest.equals("SAINIKPURI")) {
						bill=bill+nt*10;
					}
					if(src.equals("RADHIKA")&&dest.equals("ECIL")||src.equals("ECIL")&&dest.equals("RADHIKA")) {
						bill=bill+nt*10;
					}
					if(src.equals("SAINIKPURI")&&dest.equals("ECIL")||src.equals("ECIL")&&dest.equals("SAINIKPURI")) {
						bill=bill+nt*20;
					}
					res = JOptionPane.showConfirmDialog(btnNewButton, "NAME: "+name+"\nSOURCE: "+src+"\nDESTINATION: "+dest+"\nAMOUNT: "+bill);
					if(res==0) {
						JOptionPane.showMessageDialog(btnNewButton, "Booking confirmed!");
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Booking cancelled!");
					}
				}
	             			
			}
		});
		btnNewButton.setBounds(180, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}
