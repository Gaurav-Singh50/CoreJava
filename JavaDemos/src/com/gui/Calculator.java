package com.gui;

import java.awt.*;

import java.awt.event.*;
public class Calculator extends Frame implements WindowListener,ActionListener
{
	Label lblno1,lblno2,lblno3;
	TextField txtnum1,txtnum2,txtnum3;
	Button btnadd,btnsub,btnmul,btndiv,btnsqrt,btnpower;

	public void viewcomponent()
	{
		lblno1=new Label("NUMBER 1");
		lblno2=new Label("NUMBER 2");
		lblno3=new Label("RESULT   ");
		
		txtnum1=new TextField(20);
		txtnum2=new TextField(20);
		txtnum3=new TextField(20);
		
		btnadd=new Button("ADDITION");
		btnsub=new Button("SUBTRACT");
		btnmul=new Button("MULTIPLIPLY");
		btndiv=new Button("DIVIDE");
		btnsqrt=new Button("SQUARE ROOT");
		btnpower=new Button("POWER");
		
		add(lblno1);
		add(txtnum1);
		
		add(lblno2);
		add(txtnum2);
		
		add(lblno3);
		add(txtnum3);
		add(btnadd);
		btnadd.addActionListener(this);
		add(btnsub);
		btnsub.addActionListener(this);
		add(btnmul);
		btnmul.addActionListener(this);
		add(btndiv);
		btndiv.addActionListener(this);
		add(btnsqrt);
		btnsqrt.addActionListener(this);
		add(btnpower);
		btnpower.addActionListener(this);
	}
	
	
	  @Override public void paint(Graphics g) {
	  
	  g.setColor(Color.ORANGE); 
	  g.setFont(new Font("Cooper",Font.ITALIC,35));
	  g.drawString("FUN CALCULATOR", 50, 70); }
	 
	
	
	
	public Calculator(String title)
	{
		super(title);
		setSize(400,600);
		
		setBackground(Color.GRAY);
		setLayout(new FlowLayout(500, 40, 50));
		
		this.addWindowListener(this);
		viewcomponent();
		setVisible(true);
		
	}

	public static void main(String[] args) {
	     new Calculator("calculator");
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
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
	public void actionPerformed(ActionEvent ae) 
	{
		
		//String num1=txtnum1.getText();
		
//		double n1=Double.parseDouble(num1);
		double num1=Double.parseDouble(txtnum1.getText());
		double num2=Double.parseDouble(txtnum2.getText());
		double result=0.0;
		
		String caption=ae.getActionCommand();
		if(caption.equalsIgnoreCase("Addition"))
		{
			System.out.println(caption);
			result=num1+num2;
			
		}
		
		if(caption.equalsIgnoreCase("Subtract"))
		{
			
			System.out.println(caption);
		}
		
		String final_result=String.valueOf(result);//double to String
		txtnum3.setText(final_result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
