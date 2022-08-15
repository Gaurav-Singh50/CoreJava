package com.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
public class ComboEventFrame  extends Frame
{

	CustomCombo combocolor;
	
	public ComboEventFrame() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(200,200);
		setBackground(Color.cyan);
		combocolor=new CustomCombo();
		combocolor.add("RED");
		combocolor.add("GREEN");
		combocolor.add("YELLOW");
		add(combocolor);
		setVisible(true);
			
	}
	
	class CustomCombo extends Choice
	{
		
		public CustomCombo()
		{
				
				enableEvents(AWTEvent.ITEM_EVENT_MASK);
				
		}
		
		@Override
		protected void processItemEvent(ItemEvent e) {
			// TODO Auto-generated method stub
			super.processItemEvent(e);
			System.out.println(getSelectedItem());
			String color=getSelectedItem();
			switch(color)
			{
				case "RED":
					ComboEventFrame.this.setBackground(Color.RED);
					break;
				case "GREEN":
					setBackground(Color.GREEN);
					break;
				case "YELLOW":
					setBackground(Color.YELLOW);
					break;
				default:
					setBackground(Color.GRAY);
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ComboEventFrame btnevent=new ComboEventFrame();
					
		
	}
}
