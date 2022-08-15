package contactapp.userinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import contactapp.admin.AdminDashBoard;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.event.*;
public class Login extends JFrame  implements ActionListener
{

	private JPanel contentPane;
	private JTextField txtid;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() 
	{
		setForeground(new Color(220, 20, 60));
		setFont(new Font("Cooper Black", Font.BOLD | Font.ITALIC, 25));
		setBackground(new Color(25, 25, 112));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/contactapp/images/user1.png")));
		setResizable(false);
		setTitle("LOG-IN\r\n");
		showComponents();
		
	}
	
	public void showComponents()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(178, 34, 34), 15, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOG-IN PAGE");
		lblLogin.setOpaque(true);
		lblLogin.setBackground(new Color(220, 220, 220));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.RED);
		lblLogin.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 40));
		lblLogin.setBounds(197, 29, 489, 43);
		contentPane.add(lblLogin);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setOpaque(true);
		lblid.setBackground(new Color(220, 220, 220));
		lblid.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblid.setForeground(new Color(0, 128, 0));
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setBounds(123, 152, 271, 43);
		contentPane.add(lblid);
		
		JLabel lblpassword = new JLabel("PASSWORD:");
		lblpassword.setForeground(new Color(0, 100, 0));
		lblpassword.setOpaque(true);
		lblpassword.setBackground(new Color(220, 220, 220));
		lblpassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblpassword.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblpassword.setBounds(131, 287, 252, 43);
		contentPane.add(lblpassword);
		
		txtid = new JTextField();
		txtid.setToolTipText("ENTER USER_ID");
		txtid.setBackground(new Color(220, 220, 220));
		txtid.setForeground(new Color(72, 209, 204));
		txtid.setFont(new Font("Snap ITC", Font.ITALIC, 30));
		txtid.setBounds(479, 152, 298, 43);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setEchoChar('.');
		txtpass.setForeground(new Color(64, 224, 208));
		txtpass.setFont(new Font("Snap ITC", Font.ITALIC, 30));
		txtpass.setBackground(new Color(220, 220, 220));
		txtpass.setBounds(479, 287, 298, 43);
		contentPane.add(txtpass);
		
		JButton btnSubmit = new JButton("Submit      ");
			
		btnSubmit.addActionListener(this);//register the listener with Button
			
		btnSubmit.setHorizontalTextPosition(SwingConstants.LEFT);
		btnSubmit.setIcon(new ImageIcon(Login.class.getResource("/contactapp/images/submit.png")));
		btnSubmit.setForeground(new Color(255, 0, 0));
		btnSubmit.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 40));
		btnSubmit.setBackground(new Color(0, 128, 128));
		btnSubmit.setBounds(131, 354, 646, 143);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/contactapp/images/background.jpeg")));
		lblNewLabel.setBounds(10, 11, 870, 497);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			doLogin();
		
		
		
	}
	
	
	public boolean checkEmpty(String id,String pass)
	{
		if(id.isEmpty()||pass.length()==0)
			return true;
		else
			return false;
		
	}
	
	public void doLogin()
	{
		String userid=txtid.getText().trim();
		
		
		char[]pass=	txtpass.getPassword();
		
		String userpass=String.valueOf(pass);
		
		if(checkEmpty(userid, userpass))
		{

			JOptionPane.showMessageDialog(this, "UserId/Password required");
		}
		else {
			
			if(userid.equalsIgnoreCase("scott") &&userpass.equals("tiger"))
			{
				JOptionPane.showMessageDialog(this, "Welcome "+userid);
				AdminDashBoard ad=new AdminDashBoard();
					ad.setVisible(true);
					this.dispose();//Login Frame getting closed
				
			}
			
			else {
				JOptionPane.showMessageDialog(this, "Invalid userid/Password");
			}
		}
		
		
		
		
			
		
	}
	
	
	
	
	
	
	
}
