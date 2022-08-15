package com.gui;
import java.awt.*;

import java.awt.event.*;
public class UserFrame  extends Frame implements ActionListener
{
	
	
	Label lblname;
	TextField txtname,txtdata;
	Button btnsubmit;
	
	
	public void actionPerformed(ActionEvent e)//override the method of ActionListener<<Interface>>
	{
		System.out.println("Button is being clicked");
		String name=	txtname.getText();//fetch the value from textfield in the form of String
		System.out.println("Hello "+name);
		txtdata.setText("Hello "+name);
		
	}
	
	public void drawComponents()
	{
		lblname=new Label("Enter Name");
		txtname=new TextField(20);
		btnsubmit=new Button("Submit");
		
		txtdata=new TextField(20);
		
		btnsubmit.addActionListener(this);//Run Time polymorphism with interface
		add(lblname);
		add(txtname);
		add(txtdata);
		add(btnsubmit);
	
	
		
	}
	public UserFrame(String title)
	{
		
		super(title);
		setSize(600, 300);
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		drawComponents();
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) 
	{
	UserFrame u=	new UserFrame("UserDetails");
	//u.drawComponents();
	}
	
}
