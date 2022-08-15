package com.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
public class ButtonEventFrame  extends Frame
{

	CustomButton cb;
	
	public ButtonEventFrame() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(200,200);
		setBackground(Color.cyan);
		cb=new CustomButton("Click Me");
		add(cb);
		setVisible(true);
			
	}
	
	@Override
	public void paint(Graphics g) {

		System.out.println("in paint");
		g.draw3DRect(30,40,100,200,true);
		g.drawString("hello",40,30 );
	}
	class CustomButton extends Button
	{
		
		public CustomButton(String caption)
		{
				super(caption);
				enableEvents(AWTEvent.ACTION_EVENT_MASK);
				
		}
		@Override
		protected void processActionEvent(ActionEvent e) {
			
			//super.processActionEvent(e);
			
			System.out.println("Button Clicked");
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ButtonEventFrame btnevent=new ButtonEventFrame();
					
		
	}
}
