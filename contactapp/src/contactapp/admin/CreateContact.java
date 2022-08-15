package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import contactapp.beans.CategoryBean;
import contactapp.dbtask.DbConnection;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.sql.*;



public class CreateContact extends JFrame implements ActionListener,KeyListener
{

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtemail;
	private JTextField txtphone;
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private final ButtonGroup gender = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateContact frame = new CreateContact();
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
	public CreateContact()
	{
		con=DbConnection.createConnection();
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateContact.class.getResource("/contactapp/images/createcontactimage.png")));
		setTitle("CreateContact");
		createComponents();
		
	//DbConnection.createConnection();
		
		
		
	}
	JRadioButton rdmale,rdfemale;
	JCheckBox  chkagree;
	JComboBox<CategoryBean> cmbcategory;
	private JScrollPane scrollPane;
	private JTextArea txtaddress;
	
	
	public void fillCombo()
	{
	
		String strsql="select * from category";
	
		try {
			
		ps=con.prepareStatement(strsql);
		rs=ps.executeQuery();
		while(rs.next())
		{
		String name=	rs.getString("categoryname");
		
		int catid=rs.getInt("categoryid");
		
		cmbcategory.addItem(new CategoryBean(catid, name));
			
		}
		
		}
		
		catch(SQLException se)
		{
			
			se.printStackTrace();
		}
		finally {
			try {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public void createComponents()
	{
		//int x=30;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//only frame will be closed
		setBounds(100, 100, 855, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 10));
		
		setLocationRelativeTo(null);//put frame in center
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblname = new JLabel("NAME:");
		lblname.setHorizontalAlignment(SwingConstants.CENTER);
		lblname.setOpaque(true);
		lblname.setBackground(new Color(220, 220, 220));
		lblname.setForeground(new Color(128, 0, 0));
		lblname.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblname.setBounds(193, 67, 171, 29);
		contentPane.add(lblname);
		
		JLabel lblemail = new JLabel("EMAIL:");
		lblemail.setOpaque(true);
		lblemail.setHorizontalAlignment(SwingConstants.CENTER);
		lblemail.setBackground(new Color(220, 220, 220));
		lblemail.setForeground(new Color(128, 0, 0));
		lblemail.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblemail.setBounds(193, 127, 171, 29);
		contentPane.add(lblemail);
		
		JLabel lblphone = new JLabel("PHONE NO:");
		lblphone.setHorizontalAlignment(SwingConstants.CENTER);
		lblphone.setForeground(new Color(128, 0, 0));
		lblphone.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblphone.setBackground(new Color(220, 220, 220));
		lblphone.setOpaque(true);
		lblphone.setBounds(193, 187, 171, 23);
		contentPane.add(lblphone);
		
		JLabel lbladdress = new JLabel("ADDRESS:");
		lbladdress.setBackground(new Color(220, 220, 220));
		lbladdress.setOpaque(true);
		lbladdress.setForeground(new Color(128, 0, 0));
		lbladdress.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lbladdress.setBounds(193, 237, 171, 32);
		contentPane.add(lbladdress);
		
		 rdmale = new JRadioButton("MALE");
		gender.add(rdmale);
		rdmale.setHorizontalAlignment(SwingConstants.CENTER);
		rdmale.setBackground(new Color(220, 220, 220));
		rdmale.setForeground(new Color(128, 0, 0));
		rdmale.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		rdmale.setBounds(228, 295, 130, 23);
		contentPane.add(rdmale);
		
		 rdfemale = new JRadioButton("FEMALE");
		gender.add(rdfemale);
		rdfemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdfemale.setForeground(new Color(128, 0, 0));
		rdfemale.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		rdfemale.setBackground(new Color(220, 220, 220));
		rdfemale.setBounds(464, 315, 138, 23);
		contentPane.add(rdfemale);
		
		 chkagree = new JCheckBox("I AGREE");
		chkagree.setHorizontalAlignment(SwingConstants.CENTER);
		chkagree.setBackground(new Color(220, 220, 220));
		chkagree.setForeground(new Color(128, 0, 0));
		chkagree.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 25));
		chkagree.setBounds(289, 404, 215, 23);
		contentPane.add(chkagree);
		
		 cmbcategory = new JComboBox<CategoryBean>();
		cmbcategory.setForeground(new Color(128, 0, 0));
		cmbcategory.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		cmbcategory.setBackground(new Color(220, 220, 220));
		//cmbcategory.setModel(new DefaultComboBoxModel(new String[] {"SELECT CATEGORY"}));
		cmbcategory.setBounds(245, 345, 308, 39);
		fillCombo();
		contentPane.add(cmbcategory);
		
		JButton btnadd = new JButton("ADD");
		btnadd.addActionListener(this);
		btnadd.setBackground(new Color(220, 220, 220));
		btnadd.setForeground(new Color(128, 0, 0));
		btnadd.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 25));
		btnadd.setHorizontalTextPosition(SwingConstants.CENTER);
		btnadd.setBounds(342, 452, 119, 39);
		contentPane.add(btnadd);
		
		txtname = new JTextField();
		txtname.addKeyListener(this);
		
		txtname.setForeground(new Color(184, 134, 11));
		txtname.setFont(new Font("Snap ITC", Font.ITALIC, 15));
		txtname.setBackground(new Color(220, 220, 220));
		txtname.setBounds(464, 70, 187, 27);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setForeground(new Color(184, 134, 11));
		txtemail.setFont(new Font("Snap ITC", Font.ITALIC, 15));
		txtemail.setBackground(new Color(220, 220, 220));
		txtemail.setBounds(464, 130, 187, 26);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.addKeyListener(this);
		
		txtphone.setBackground(new Color(220, 220, 220));
		txtphone.setForeground(new Color(184, 134, 11));
		txtphone.setFont(new Font("Snap ITC", Font.ITALIC, 15));
		txtphone.setBounds(464, 188, 187, 25);
		contentPane.add(txtphone);
		txtphone.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(450, 224, 321, 100);
		contentPane.add(scrollPane);
		
		txtaddress = new JTextArea();
		txtaddress.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		txtaddress.setWrapStyleWord(true);
		txtaddress.setLineWrap(true);
		txtaddress.setRows(4);
		txtaddress.setColumns(20);
		scrollPane.setViewportView(txtaddress);
		
		 
	}
	String name,email,phone,address,genderdata,status;
	int catid;
	@Override
	public void actionPerformed(ActionEvent e) {
		 name=txtname.getText().trim();
		 email=txtemail.getText().trim();
		 phone=txtphone.getText();
		 address=txtaddress.getText();
		
			 genderdata="";
			if(rdfemale.isSelected())
				genderdata=rdfemale.getText();
			if(rdmale.isSelected())
				genderdata=rdmale.getText();
			
			 status="";
			
			
			if(chkagree.isSelected())
			{
				status=chkagree.getText();
			}
		

	CategoryBean cat=(CategoryBean)cmbcategory.getSelectedItem();
	catid=cat.getCategoryid();
	
	
	
			if(	checkEmpty(name,email,phone,address,genderdata,status))
			{
				JOptionPane.showMessageDialog(this, "Please Select all the mandatory fields");
			}
			else {
				
				
				//JOptionPane.showMessageDialog(this, "Thanks for adding contact");
				
	String strinsert="insert into contacts(name, email, phone, address, gender, categoryId, status, date) values(?,?,?,?,?,?,?,?)";
	
	try {
		
		java.util.Date d=new java.util.Date();
			long date=d.getTime();
		java.sql.Date sd=new java.sql.Date(date);

		ps=con.prepareStatement(strinsert);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, address);
		ps.setString(5, genderdata);
		ps.setInt(6, catid);
		ps.setString(7, status);
		ps.setDate(8, sd);
		System.out.println(ps);
		int row_status=ps.executeUpdate();
		
		if(row_status>0)
		{
			JOptionPane.showMessageDialog(this,"Contact added", "AddContact",JOptionPane.INFORMATION_MESSAGE );
			
			txtaddress.setText("");
			gender.clearSelection();
			chkagree.setSelected(false);
		}
		
		
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
	
	
	
	
	public boolean checkEmpty(String name,String email,String phone,String address,String gender,String status)
	{
		
		if(name.isEmpty()||email.isEmpty()||phone.isEmpty()||address.isEmpty()||gender.isEmpty()||
				status.isEmpty())
		{
			
			return true;
		}
		else
			return false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		Object obj=e.getSource();
		JTextField jt=(JTextField)obj;
		char c=e.getKeyChar();
		//System.out.print(c);
		//System.out.println(e.getKeyCode());
			
		if(jt==txtname)
		{
			
		
			   if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
			            ||  (c== KeyEvent.VK_ENTER)      || (c == KeyEvent.VK_TAB) 
			            ||  (Character.isLetter(c)))) 
			
			{
				e.consume();
				
			 JOptionPane.showMessageDialog(this,"Name Requires Only Alphabets");
			}
			
			
				
				
				
		}
		
		//second if for phone
		if(jt==txtphone)
		{
			
		
			   if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
			            ||  (c== KeyEvent.VK_ENTER)      || (c == KeyEvent.VK_TAB) 
			            ||  (Character.isDigit(c)))) 
			
			{
				e.consume();
				
			 JOptionPane.showMessageDialog(this,"Phone Requires Only Numbers");
			}
			
			
				
				
				
		}
		
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
