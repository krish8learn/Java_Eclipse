import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.*;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField email;
	private JTextField password;
	private JLabel lblUserName;
	private JLabel lblUserName_1;
	private JLabel lblUserName_2;
	private JButton btnEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		user = new JTextField();
		user.setText("ENTER USERNAME");
		user.setBounds(99, 50, 250, 19);
		contentPane.add(user);
		user.setColumns(10);
		
		email = new JTextField();
		email.setText("ENTER EMAIL");
		email.setColumns(10);
		email.setBounds(99, 119, 250, 19);
		contentPane.add(email);
		
		password = new JTextField();
		password.setText("ENTER PASSWORD");
		password.setColumns(10);
		password.setBounds(99, 183, 250, 19);
		contentPane.add(password);
		
		lblUserName = new JLabel("USER FIELD");
		lblUserName.setBounds(99, 33, 123, 15);
		contentPane.add(lblUserName);
		
		lblUserName_1 = new JLabel("EMAIL FIELD");
		lblUserName_1.setBounds(99, 102, 123, 15);
		contentPane.add(lblUserName_1);
		
		lblUserName_2 = new JLabel("PASSWORD FIELD");
		lblUserName_2.setBounds(99, 167, 178, 15);
		contentPane.add(lblUserName_2);
		
		btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306 ","root ","Krishknight8");
				PreparedStatement ps = conn.prepareStatement("insert into test(user_name,user_email,user_password) values(?,?,?);");
				ps.setString(1, user.getText());
				ps.setString(2, email.getText());
				ps.setString(3, password.getText());
				int x = ps.executeUpdate();
				if(x!=0)
				{
					System.out.println("Registration done");
				}
				else
				{
					System.out.println("Regitration failed");
				}
			}catch(Exception e1) {
				System.out.println(e1);
			}
		}});
		btnEnter.setBounds(232, 224, 117, 25);
		contentPane.add(btnEnter);
	}

}
