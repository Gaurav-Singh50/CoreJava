package com.gui;
import java.awt.*;
public class DemoFrame  extends Frame
{

	public DemoFrame(String title)
	{
		System.out.println("In Frame");
		setTitle(title);
		//super(title);
		setSize(400,300);//Window class
		//setBackground(Color.CYAN);
		//setVisible(true);
		setBackground(new Color(100,100,200));
		
	}
	
	
	@Override
	public void paint(Graphics g)
	{
		System.out.println("in paint method");
		g.setColor(Color.magenta);
		g.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		g.drawString("Hello Frame",100,90);
		g.setColor(Color.RED);
		g.drawLine(120,200,300,200);
		g.drawRect(100,220,300,100);
		g.drawOval(20, 100, 200, 200);
		g.fillRect(30,50,100,100);
	}
	
	public static void main(String[] args) {
		//new DemoFrame("FirstFrame");
		DemoFrame d=new DemoFrame("FirstFrame");
				d.setVisible(true);
				
	}
	
}
