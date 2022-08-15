package contactapp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.Date;
public class Demo_DateChooser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo_DateChooser frame = new Demo_DateChooser();
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
	public Demo_DateChooser() {
	
		createComponents();
	}
	
	JDateChooser dateChooser;
	private JButton btnNewButton;
	public void createComponents()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 dateChooser = new JDateChooser();
		 dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(182, 71, 318, 39);
		contentPane.add(dateChooser);
		//this.addWindowListener(null);
		
				JButton btnsubmit = new JButton("submit");
				btnsubmit.addActionListener(new ActionListener()//A->
						{
						public void actionPerformed(ActionEvent ae)
						{
							
						System.out.println("hello submit");
							
				java.util.Date	dt=	dateChooser.getDate();
				java.sql.Date sd=new java.sql.Date(dt.getTime());
			JOptionPane.showMessageDialog(Demo_DateChooser.this,sd)	;
			System.out.println(sd);
							
						} }	);
				
				
				
				
		btnsubmit.setBounds(260, 246, 176, 54);
		contentPane.add(btnsubmit);
		
		btnNewButton = new JButton("ok");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

					System.out.println("ok");
					show_demo();
					
			}
		});
		btnNewButton.setBounds(158, 359, 89, 23);
		contentPane.add(btnNewButton);
		
			
		
		
		
		
	}
	
	  public void show_demo() { System.out.println("show");
	  }
	 
	
	
}
