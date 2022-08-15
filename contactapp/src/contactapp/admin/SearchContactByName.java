package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import contactapp.beans.Contacts;
import contactapp.dbtask.DbConnection;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class SearchContactByName extends JFrame implements ActionListener,KeyListener,WindowListener{

	private JPanel contentPane;
	private JTextField txtname;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchContactByName frame = new SearchContactByName();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	private ArrayList<Contacts> contactdetails;
	/**
	 * Create the frame.
	 */
	public SearchContactByName() 
	{
		con=DbConnection.createConnection();
		model=new DefaultTableModel();
		contactdetails=new ArrayList<Contacts>();
		//setIconImage(Toolkit.getDefaultToolkit().getImage(SearchContactByName.class.getResource("/contactapp/images/searchframe.png")));
		setTitle("SearchContact");
		this.addWindowListener(this);
		createComponents();
	}
	
	public void createRows()
	{
		int flag=0;
		Contacts c=null;
		String strsql="select email,phone,address,gender from contacts where name=?";
		try
		{
			if(!contactdetails.isEmpty())
			contactdetails.clear();//clearing data from arraylist
			
			
		   // model.getDataVector().removeAllElements();
		  
		    //revalidate();
		    
		    
			if (model.getRowCount() > 0)
			  {
				 // System.out.println("in if");
			  for (int i = model.getRowCount()-1; i >=0; i--)
			  
			  { 
				  
				  System.out.println("in forindex"+i);
				 model.removeRow(i);//Remove row from JTable
				  System.out.println("after");
			  } 
			 
			
			  }
			ps=con.prepareStatement(strsql);
			ps.setString(1,name);
			rs=ps.executeQuery();
			while(rs.next())
			{
				flag=1;
				
				c=new Contacts(rs.getString("email"),rs.getString("phone"),rs.getString("address"),rs.getString("gender"));
				contactdetails.add(c);
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		
		if(flag == 0)
		{
			JOptionPane.showMessageDialog(this,"No DATA found","DATA ERROR",JOptionPane.ERROR_MESSAGE);
			//table.setModel(null);
//			if(!contactdetails.isEmpty())
//				contactdetails.clear();
//			  model.getDataVector().removeAllElements();
//			  
//			    revalidate();
//			    
		}
		else
		{
			for(Contacts ct:contactdetails)
			{
				String[]rowdata= {ct.getEmail(),ct.getPhone(),ct.getAddress(),ct.getGender()};
				model.addRow(rowdata);  //creating Jtable rows
			}
		}
	}
	
	
	
	private DefaultTableModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createComponents()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //to close child window only
		setBounds(100, 100, 911, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);  //to set child window in  enter of screen
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblname = new JLabel("Enter Name:");
		lblname.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		lblname.setOpaque(true);
		lblname.setBackground(new Color(220, 220, 220));
		lblname.setHorizontalAlignment(SwingConstants.CENTER);
		lblname.setForeground(new Color(128, 0, 0));
		lblname.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblname.setBounds(41, 89, 298, 39);
		contentPane.add(lblname);
		
		txtname = new JTextField();
		txtname.setHorizontalAlignment(SwingConstants.CENTER);
		txtname.setBorder(new LineBorder(new Color(128, 0, 0), 3));
		txtname.setForeground(new Color(220, 20, 60));
		txtname.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		txtname.setBackground(new Color(220, 220, 220));
		txtname.setBounds(406, 89, 380, 39);
		contentPane.add(txtname);
		txtname.addKeyListener(this);
		txtname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("SEARCH CONTACT BY NAME PAGE");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(250, 128, 114));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(178, 23, 495, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnsearch = new JButton("SEARCH");
		btnsearch.setBackground(new Color(220, 220, 220));
		btnsearch.setBorder(new LineBorder(new Color(128, 0, 0), 3));
		btnsearch.setIcon(null);
		btnsearch.setForeground(new Color(128, 0, 0));
		btnsearch.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 25));
		btnsearch.setBounds(280, 152, 255, 67);
		btnsearch.addActionListener(this);
		btnsearch.addKeyListener(this);
		contentPane.add(btnsearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(41, 230, 829, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(220, 20, 60));
		table.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		table.setBackground(new Color(220, 220, 220));
		scrollPane.setViewportView(table);
		
		JTableHeader header=table.getTableHeader();//returns reference of header
		header.setBackground(Color.CYAN);
		header.setForeground(Color.RED);
		header.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
		
		String[]colnames= {"EmailId","Address","PhoneNumber","Gender"};
		model.setColumnIdentifiers(colnames);//create columns of our table
		
		table.setModel(model);
	}

	String name;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		name=txtname.getText().trim();
		if(name.isEmpty())
		{
			JOptionPane.showMessageDialog(this,"Enter Name","MANDATORY",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			
			createRows();
			table.setModel(model);
			
		}	
	}



	@Override
	public void keyTyped(KeyEvent e) 
	{
		char c=e.getKeyChar();
		int d=0;
		
		if(!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_ENTER) || (c==KeyEvent.VK_TAB) 
				||(Character.isLetter(c)) ))
		{
			e.consume();
			JOptionPane.showMessageDialog(this,"Name Requires only alphabets");
		}
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		DbConnection.closeConnection();
		JOptionPane.showMessageDialog(this, "Thank You");
		
		
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
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
