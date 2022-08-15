package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import contactapp.dbtask.DbConnection;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import java.awt.event.*;

public class UpdateContact extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtemail;
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
					
					UpdateContact frame = new UpdateContact();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateContact()
	{
		con=DbConnection.createConnection();
		setResizable(false);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateContact.class.getResource("/contactapp/images/updatecontact.png")));
		setTitle("UpdateContact");
		createComponents();
	}
	
	public void fillCombo()
	{
		
		String  strsql="select  phone from contacts";
		try {
			
			ps=con.prepareStatement(strsql);
			rs=ps.executeQuery();
				while(rs.next())
				{
					String phonenumber=rs.getString("phone");
					cmbphone.addItem(phonenumber);
				}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
		finally {
			
			try {
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		
		
	}
	
	private JTextArea txtaddress;
	private JComboBox<String> cmbphone;
	private JTextField txtname;
	private JButton btnupdate;
	
	public void createComponents()
	{
		
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 901, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 0, 51), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 cmbphone = new JComboBox();
		cmbphone.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cmbphone.setForeground(new Color(102, 0, 0));
		cmbphone.setFont(new Font("Snap ITC", Font.BOLD, 20));
		cmbphone.setModel(new DefaultComboBoxModel(new String[] {"SELECT PHONE"}));
		cmbphone.setBackground(new Color(204, 204, 255));
		cmbphone.setBounds(290, 124, 237, 47);
		cmbphone.addActionListener(this);
		
		fillCombo();
		contentPane.add(cmbphone);
		
		JLabel lblheading = new JLabel("Update Contact Page");
		lblheading.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblheading.setIcon(null);
		lblheading.setOpaque(true);
		lblheading.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblheading.setHorizontalAlignment(SwingConstants.CENTER);
		lblheading.setForeground(new Color(102, 0, 0));
		lblheading.setBackground(new Color(204, 204, 255));
		lblheading.setBounds(106, 44, 589, 35);
		contentPane.add(lblheading);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setBorder(new LineBorder(new Color(102, 0, 0), 2));
		lblemail.setHorizontalAlignment(SwingConstants.CENTER);
		lblemail.setForeground(new Color(102, 0, 0));
		lblemail.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblemail.setOpaque(true);
		lblemail.setBackground(new Color(204, 204, 255));
		lblemail.setBounds(106, 263, 214, 39);
		contentPane.add(lblemail);
		
		JLabel lbladdress = new JLabel("Address:");
		lbladdress.setBorder(new LineBorder(new Color(102, 0, 0), 2));
		lbladdress.setOpaque(true);
		lbladdress.setForeground(new Color(102, 0, 0));
		lbladdress.setHorizontalAlignment(SwingConstants.CENTER);
		lbladdress.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lbladdress.setBackground(new Color(204, 204, 255));
		lbladdress.setBounds(106, 366, 214, 35);
		contentPane.add(lbladdress);
		
		txtemail = new JTextField();
		txtemail.setBackground(new Color(204, 204, 255));
		txtemail.setForeground(new Color(204, 51, 51));
		txtemail.setFont(new Font("Snap ITC", Font.ITALIC, 15));
		txtemail.setBorder(new LineBorder(new Color(102, 0, 0), 2));
		txtemail.setBounds(442, 263, 253, 39);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		 btnupdate = new JButton("UPDATE");	
		btnupdate.setForeground(new Color(102, 0, 0));
		btnupdate.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		btnupdate.setBackground(new Color(204, 204, 255));
		btnupdate.setBorder(new LineBorder(new Color(102, 0, 0), 2, true));
		btnupdate.setBounds(290, 490, 237, 54);
		btnupdate.addActionListener(this);
		contentPane.add(btnupdate);
		
		 txtaddress = new JTextArea();
		txtaddress.setFont(new Font("Snap ITC", Font.ITALIC, 15));
		txtaddress.setBackground(new Color(204, 204, 255));
		txtaddress.setBorder(new LineBorder(new Color(102, 0, 0), 2));
		txtaddress.setForeground(new Color(255, 51, 51));
		txtaddress.setBounds(442, 367, 253, 34);
		contentPane.add(txtaddress);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon(UpdateContact.class.getResource("/contactapp/images/updatebackground.jpeg")));
		lblNewLabel.setBounds(10, 11, 867, 556);
		contentPane.add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.setEditable(false);
		txtname.setEnabled(false);
		txtname.setBounds(364, 190, 307, 62);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(106, 195, 49, 14);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String phonenumber=null;
		phonenumber=(String)cmbphone.getSelectedItem();
		if(e.getSource()==cmbphone)
		{
			
			
		
			if(phonenumber.equalsIgnoreCase("SELECT PHONE"))
			{
				JOptionPane.showMessageDialog(this, "SElect a valid phonenumber","Error",JOptionPane.ERROR_MESSAGE);
				txtname.setText("");
				txtemail.setText("");
				txtaddress.setText("");
			}
			else {
			String strsql="select * from contacts where phone=?";
			
			try {
				ps=con.prepareStatement(strsql);
				ps.setString(1, phonenumber);
				rs=ps.executeQuery();
				rs.next();
				String name=rs.getString("name");
				String email=rs.getString("email");
			txtname.setText(name);	
			txtemail.setText(email);
			txtaddress.setText(rs.getString("address"));
				
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			finally {
				try {if(ps!=null)
					ps.close();
					if(rs!=null)
						rs.close();
					
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			}
			}//else close
		}
		if(e.getSource()==btnupdate)
		{
			
			if(phonenumber.equalsIgnoreCase("SELECT PHONE"))
			{
				JOptionPane.showMessageDialog(this, "Select a valid phonenumber","Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
			
			else {
				
			String address=txtaddress.getText().trim();
			String email=txtemail.getText().trim();
			if(address.isEmpty()||email.isEmpty())
				
			{
				JOptionPane.showMessageDialog(this, "fill all the  fileds", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
				
					String strupdate="update contacts set email=?,address=? where phone=?";
					
					try {
						ps=con.prepareStatement(strupdate);
						ps.setString(1, email);
						ps.setString(2, address);
						ps.setString(3, phonenumber);
				int status=		ps.executeUpdate();
					if(status>0)
						JOptionPane.showMessageDialog(this, "Contact Updated Successfully");
						
					}
					catch(SQLException se)
					{
						se.printStackTrace();
					}
					finally {
						
						if(ps!=null)
							try {
								ps.close();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
			
			
			}
			
			
				
			}
			
			
			
			
		}

		
	}
	
	
	
	
	
	
	
}
