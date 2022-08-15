package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import contactapp.dbtask.DbConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
public class Category extends JFrame  implements ActionListener,WindowListener
{

	private JPanel contentPane;
	private JTextField txtcategory;
	
	private Connection con;
	private PreparedStatement ps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category frame = new Category();
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
	public Category() {
		
		con=DbConnection.createConnection();//contact_db reference
		this.addWindowListener(this);
		createComponents();
	}
	
	public void createComponents()
	{
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CategoryName");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(97, 101, 194, 59);
		contentPane.add(lblNewLabel);
		
		txtcategory = new JTextField();
		txtcategory.setBounds(287, 101, 251, 70);
		contentPane.add(txtcategory);
		txtcategory.setColumns(10);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(this);
		btnsubmit.setBounds(277, 284, 158, 70);
		contentPane.add(btnsubmit);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{

		insertData();

	}
	
	public void insertData()
	{
		
		String name=txtcategory.getText().trim();
		if(name.isEmpty())
			JOptionPane.showMessageDialog(this, "Please enter category name");
		else
		{
			String strinsert="insert into category(categoryname)values(?)";//? ->placeholder
			
			try {
				
				ps=con.prepareStatement(strinsert);//query gets complied only once
				ps.setString(1, name);
				System.out.println(ps);
			int status=ps.executeUpdate();//insert or update or delete
			
			if(status>0)
				
			JOptionPane.showMessageDialog(this, "Category added successfully");
			
			txtcategory.setText("");
				
				
			}
			catch(SQLException se)
			{
				se.printStackTrace();
				System.out.println(se.getErrorCode());
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
			
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		DbConnection.closeConnection();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		;
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
