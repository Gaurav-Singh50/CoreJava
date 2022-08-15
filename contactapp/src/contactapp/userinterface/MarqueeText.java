package contactapp.userinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MarqueeText extends JFrame {

	private JPanel contentPane;
	private 	JLabel  lblHelloWorld;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarqueeText frame = new MarqueeText();
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
	public MarqueeText() {
		
		createGui();
		moveLabel();
	}
	
	
	public void moveLabel()
	{
		
	Thread t=	new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				
				int left=5;
				int top=168;
				int width=472;
				int height=39;
				
				while(true)
				{
					if(left>866)
						left=20;
					lblHelloWorld.setBounds(left, top, width, height);
					contentPane.add(lblHelloWorld);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					left=left+10;
				
				}
				
				
				
				
			}
		});
	t.start();
		
	}
	
	public void createGui()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 602);//LTWH
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 lblHelloWorld = new JLabel("Spread The Joy Of Learning");
	 lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
	 lblHelloWorld.setForeground(Color.MAGENTA);
		lblHelloWorld.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblHelloWorld.setBounds(7, 11, 700, 57);
		contentPane.add(lblHelloWorld);
		
		
	}
}
