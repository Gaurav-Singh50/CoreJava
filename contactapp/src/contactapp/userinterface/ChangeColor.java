package contactapp.userinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ChangeColor extends JFrame {

	private JPanel contentPane;
int []r={255,0,0};
int []g={0,255,0};
int []b={0,0,255};


//Color c=new Color(r[0],g[0],b[0])
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeColor frame = new ChangeColor();
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
	
	
	JLabel lblname;
	public void createGui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblname = new JLabel("Learning Java is a Fun");
		 lblname.setHorizontalAlignment(SwingConstants.CENTER);
		lblname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblname.setBounds(157, 130, 378, 69);
		contentPane.add(lblname);
	}
	public ChangeColor() 
	{
		createGui();
		backgroundChange();
		
		

}
	public void backgroundChange()
	{
		
		
		
		
		new Thread(new Runnable() 
		{
			
			int i=0;
			int min=0;
			int max=255;
			@Override
			public void run() {
			try{	
				while(true)//forever thread
				{
				
					
				  Random rd=new Random(); //0 to 1
				  	
				  
			 System.out.println("random number is "+rd.nextInt());
			 	
			  int red= rd.nextInt((max-min)+1)+min; //0 to 255
			 
			  int green=rd.nextInt((max-min)+1)+min; 
			
			  int blue=rd.nextInt((max-min)+1)+min;
				  
				  
				  System.out.println("Red"+red);
				  System.out.println("Blue"+blue);
				  System.out.println("Green"+green);
					 
				
					//getContentPane().setBackground(new Color(r[i], g[i], b[i]));for fix colors
				  
					Container container=getContentPane();
				  
				  container.setBackground(new Color(red, green, blue));
				  
				  
				  
				 // getContentPane().setBackground(new Color(red,green,blue));
				  
				 lblname.setForeground(new Color(r[i],g[i],b[i]));
					  
					 Thread.sleep(2000);
					 
					  i++;
					  if(i>2) i=0;
					 
				
				}
				
					
				} catch (InterruptedException e) 
				{
				e.printStackTrace();
				}
			}
		}).start();
		
	}
	
	
	
	
	
	
}
