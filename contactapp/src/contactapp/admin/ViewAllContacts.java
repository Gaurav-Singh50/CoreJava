package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import contactapp.beans.Contacts;
import contactapp.dbtask.DbConnection;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import java.util.ArrayList;
public class ViewAllContacts extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private DefaultTableModel model;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private ArrayList<Contacts>contactlist;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllContacts frame = new ViewAllContacts();
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
	public ViewAllContacts() {
		
		model=new DefaultTableModel();
		contactlist=new ArrayList<Contacts>();
		con=DbConnection.createConnection();
		createComponents();
		
	}
	
	public void createComponents()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 65, 673, 568);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JTableHeader header=table.getTableHeader();
		header.setBackground(Color.black);
		header.setForeground(Color.WHITE);
		header.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		String[]colnames= {"ContactName","EmailId","PhoneNumber"};
		
		model.setColumnIdentifiers(colnames);//create columns
		
		
		createRows();
		
		
		table.setModel(model);
	
	}
	
	
	public void createRows()
	{
		
		int flag=0;
		Contacts c=null;
		String strsql="select name,email,phone from contacts";
		try {
			
			ps=con.prepareStatement(strsql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				flag=1;
				String name=rs.getString("name");
				
				c=new Contacts(name,rs.getString("email"),rs.getString("phone"));
				contactlist.add(c);
			}
			System.out.println("totalRows "+contactlist.size());
			System.out.println(contactlist);
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
		
		
		if(flag==0)
		{
			JOptionPane.showMessageDialog(this, "No Data found","DataError",JOptionPane.ERROR_MESSAGE);
		}
		else {
			
			for(Contacts ct:contactlist)
			{
				String[]rowdata= {ct.getName(),ct.getEmail(),ct.getPhone()};
				model.addRow(rowdata);//creating JTable Rows
				
			}
		}
		
		
		
	}
	
	
	
	
}
