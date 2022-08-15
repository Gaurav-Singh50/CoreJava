package com.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class LoginFrame  extends Frame implements ActionListener,WindowListener,KeyListener
{

	Label lblid,lblpass;
	TextField txtid,txtpass;
	Button btnsubmit;
	
	public LoginFrame(String title)
	{
		super(title);
		setLayout(null);
		setSize(300, 300);
		setBackground(Color.GRAY);
		drawComponents();
		this.addWindowListener(this);//First this refers to LoginFrame object as a source
		//second this refers to that class object in which the Windowlistener has been implemented
		setVisible(true);
	
	}
	
	public void drawComponents()
	{
	
		lblid=new Label("ID");
		lblid.setFont(new Font("Arial",Font.BOLD,20));
		lblid.setForeground(Color.GREEN);
		lblid.setBackground(Color.CYAN);
		//add(lblid,BorderLayout.WEST);
		lblid.setBounds(30,70,35,30);
		add(lblid);
		txtid=new TextField(20);
		txtid.setBounds(80, 70, 100, 30);
		
		add(txtid);
		//Another line 
		lblpass=new Label("Password");
		
		lblpass.setFont(new Font("Arial",Font.BOLD,20));
		lblpass.setForeground(Color.GREEN);
		lblpass.setBackground(Color.CYAN);
		
		lblpass.setBounds(30, 120, 100, 30);
		add(lblpass);
		txtpass=new TextField(20);
		txtpass.setBounds(140,120,100,30);
		add(txtpass);
		btnsubmit=new Button("Submit");
		btnsubmit.setBounds(110,170,100,40);
		btnsubmit.addActionListener(this);
		btnsubmit.addKeyListener(this);
		
		add(btnsubmit);
		
				}
	
	public static void main(String[] args) {
		new LoginFrame("Login");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		checkLogin();
		
	}
	
	
	public void checkLogin()
	{
		
		
		String userid=txtid.getText();
		String userpass=txtpass.getText();
		
		
		if(userid.equalsIgnoreCase("scott") && userpass.equals("tiger"))
		
			
			System.out.println("Valid User");
		
		
		
		else
			System.out.println("Invalid User");
	}
	
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{

			this.dispose();
		
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {

			int key=ke.getKeyCode();
			//System.out.println(key);
			if(key==10)
				checkLogin();
			
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	



	
	
	
	
	
	
	
	
	
	
}