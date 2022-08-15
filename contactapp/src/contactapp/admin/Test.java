package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import contactapp.beans.CategoryBean;
import contactapp.dbtask.DbConnection;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import java.util.ArrayList;
public class Test extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tablemodel;
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;

	String[]cols= {"Id","Name"};
	ArrayList<CategoryBean>categorylist;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		con=DbConnection.createConnection();
		categorylist=new ArrayList<CategoryBean>();
		tablemodel=new DefaultTableModel();
		createGui();
	}
	
	public void createRows()
	{
		
		try {
			
			String strsql="select * from category";
			ps=con.prepareStatement(strsql);
			System.out.println(ps);
		rs=	ps.executeQuery();
		CategoryBean c=null;
		while(rs.next())
		{
			int id=rs.getInt("categoryid");
			String name=rs.getString("categoryname");
			c=new CategoryBean(id, name);
			
			categorylist.add(c);
			
		}
		
		
			for(int i=0;i<categorylist.size();i++)
			{
				CategoryBean cb=categorylist.get(i);
				Object[]rowdata= {cb.getCategoryid(),cb.getCategoryname()};
				tablemodel.addRow(rowdata);
				
				
			}

		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
	public void createGui()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 24, 644, 494);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBackground(Color.ORANGE);
		tablemodel.setColumnIdentifiers(cols);

		JTableHeader header=table.getTableHeader();
		header.setBackground(Color.cyan);
		createRows();
		table.setModel(tablemodel);
		scrollPane.setViewportView(table);
	}
	
	/*if (tablemodel.getRowCount() > 0)
	  {
		 // System.out.println("in if");
	  for (int i = tablemodel.getRowCount()-1; i >=0; i--)
	  
	  { 
		  
		  System.out.println("in forindex"+i);
		  tablemodel.removeRow(i);//Remove row from JTable
		  System.out.println("after");
	  } */
	 
	
}
