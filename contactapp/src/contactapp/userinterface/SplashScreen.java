package contactapp.userinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class SplashScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread t=Thread.currentThread();
					System.out.println(t.getName());
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		
		createComponents();
		
		loadFrame();
	}
	
	public void loadFrame()
	{
		new Thread(new Runnable() {
			
			@Override
			public void run() {

					try {
						Thread.sleep(4000);
						Login login=new Login();
							login.setVisible(true);
							SplashScreen.this.dispose();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}).start();
		
		//newThreard().start()
		
	}
	
	public void createComponents()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 582);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
