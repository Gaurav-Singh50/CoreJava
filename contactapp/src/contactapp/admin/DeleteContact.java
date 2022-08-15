package contactapp.admin;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import contactapp.dbtask.DbConnection;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.*;
public class DeleteContact extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtphone;
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteContact frame = new DeleteContact();
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
	public DeleteContact()
	{
		con=DbConnection.createConnection();
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteContact.class.getResource("")));
		setForeground(new Color(153, 0, 0));
		setTitle("DeleteContact");
		createComponents();
		
	}
	
	public void createComponents()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 878, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(153, 153, 153), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Contact Page");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 51, 102), 3));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(204, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(174, 48, 512, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblphone = new JLabel("Phone No:");
		lblphone.setBorder(new LineBorder(new Color(0, 51, 102), 3));
		lblphone.setForeground(new Color(255, 51, 51));
		lblphone.setHorizontalAlignment(SwingConstants.CENTER);
		lblphone.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblphone.setOpaque(true);
		lblphone.setBackground(new Color(204, 204, 255));
		lblphone.setBounds(174, 227, 187, 40);
		contentPane.add(lblphone);
		
		txtphone = new JTextField();
		txtphone.setHorizontalAlignment(SwingConstants.CENTER);
		txtphone.setForeground(new Color(204, 102, 0));
		txtphone.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		txtphone.setBackground(new Color(204, 204, 255));
		txtphone.setBorder(new LineBorder(new Color(0, 51, 102), 3));
		txtphone.setBounds(479, 227, 207, 40);
		contentPane.add(txtphone);
		txtphone.setColumns(10);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setForeground(new Color(255, 51, 51));
		btndelete.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 25));
		btndelete.setBorder(new LineBorder(new Color(0, 51, 102), 3));
		btndelete.setBounds(330, 376, 187, 59);
		btndelete.addActionListener(this);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DeleteContact.class.getResource("")));
		lblNewLabel_1.setBounds(10, 11, 844, 499);
		contentPane.add(lblNewLabel_1);
	}

	String phonenumber;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		
		if(fetchData())
		{
			JOptionPane.showMessageDialog(this, "Enter Number");
		}
		
		else {
			
		if(!searchData(phonenumber))
		{
				
		JOptionPane.showMessageDialog(this, "NO Such PhoneNumber exists");
		
		}
		else {
					int choice=	confirmation();
					System.out.println(choice);
					if(choice==0)
					{
						
						int status=deleteData(phonenumber);
						if(status>0)
						{
						JOptionPane.showMessageDialog(this, "Record deleted Successfully", "Deletion", JOptionPane.INFORMATION_MESSAGE);
						txtphone.setText("");
						}
						
					}
		}
		}
		
	}
	
	public int deleteData(String phonenumber)
	{
		int status=0;
		String strdelete="delete from contacts where phone=?";
		
		try {
			
			ps=con.prepareStatement(strdelete);
			ps.setString(1, phonenumber);
			
		status=	ps.executeUpdate();//insert,update,delete
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
		finally {
			if(ps!=null)
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return status;
	}
	
	
	
	public  int confirmation()
	{
		
		int ch=JOptionPane.showConfirmDialog(this, "do You wish to delete this phonenumber"+phonenumber);
		return ch;
	}
	
	public boolean fetchData()
	{
		phonenumber=txtphone.getText();
		if(phonenumber.isEmpty())
		{
			//JOptionPane.showMessageDialog(this, "Enter Number", "Search", JOptionPane.ERROR_MESSAGE);
			return true;
			
		}
		return false;
	}
	
	public boolean searchData(String phonenumber)
	{
		
		
			
			String strsql="select phone from contacts where phone=?";
			try {
				
				ps=con.prepareStatement(strsql);
				ps.setString(1, phonenumber);
				rs=ps.executeQuery();
					if(rs.next())
						return true;
							}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			finally {
				
				try {
				if(ps!=null)
					ps.close();
				rs.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
					
			}
			
		
		
		return false;
		
	}
	
	
	
	
	
	

}
