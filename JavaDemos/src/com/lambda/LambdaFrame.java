package com.lambda;

import java.awt.BorderLayout;
import java.awt.EventQueue;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class LambdaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LambdaFrame frame = new LambdaFrame();
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
	public LambdaFrame() {
		
		createComponents();
	}
	
	
	public void createComponents()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnlambda = new JButton("click");
		
	//	btnlambda.addActionListener(null);
		btnlambda.addActionListener((ae)->{//ae
			
						String caption=ae.getActionCommand();
					JOptionPane.showMessageDialog(this, "hello Lambda"+caption);
			
				}
				
				);
		
		btnlambda.addActionListener(ae->{//can omit () in case of single parameter
			
			String caption=ae.getActionCommand();
		JOptionPane.showMessageDialog(this, "hello Lambda"+caption);

	}
	
	);
			
		
		btnlambda.setBounds(142, 119, 89, 23);
		contentPane.add(btnlambda);
	}
	
	
	
}
