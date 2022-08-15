package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import contactapp.userinterface.Login;

import java.awt.Frame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.*;
public class AdminDashBoard extends JFrame  implements ActionListener,WindowListener
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashBoard frame = new AdminDashBoard();
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
	public AdminDashBoard() {
		setResizable(false);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Admin\r\n");
		this.addWindowListener(this);
		createComponents();
		
	}
	
	JMenuItem miaddcontact,miupdatecontact,mideletecontact;
	
	public void createComponents()
	{
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu contactmenu = new JMenu("Contacts");
		menuBar.add(contactmenu);
		
		 miaddcontact = new JMenuItem("Create");
		 
		 miaddcontact.addActionListener(this);
		 
		contactmenu.add(miaddcontact);
		
		 miupdatecontact = new JMenuItem("Update");
		 miupdatecontact.addActionListener(this);
		contactmenu.add(miupdatecontact);
		
		 mideletecontact = new JMenuItem("Delete");
		mideletecontact.addActionListener(this);
		 
		contactmenu.add(mideletecontact);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{

				String caption=e.getActionCommand();
				if(caption.equalsIgnoreCase("Create"))
				{
					/*
					 * CreateContact contact=new CreateContact(); contact.setVisible(true);
					 */
						new CreateContact().setVisible(true);
				}
				if(caption.equalsIgnoreCase("Update"))
				{
						System.out.println("Update Frame");
				}
				
		
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {

				this.dispose();
				
				
				Login login=new Login();
					login.setVisible(true);
		
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
