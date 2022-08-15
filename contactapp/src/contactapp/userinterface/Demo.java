package contactapp.userinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;

	String[]imgarr= {"bheem.jpg","chutki.jpg","jaggu.jpg"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Demo.class.getResource("/contactapp/images/pic1.JPG")));
		setTitle("FirstFrame");
		
		createComponents();
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/contactdb","root", "precursor");
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	
	public void createComponents()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 736);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(51, 0, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmessage = new JLabel("First Frame");
		lblmessage.setOpaque(true);
		lblmessage.setBackground(new Color(51, 204, 204));
		lblmessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmessage.setForeground(new Color(102, 0, 51));
		lblmessage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblmessage.setBounds(291, 57, 193, 33);
		contentPane.add(lblmessage);
		
		JLabel lblname = new JLabel("Enter Name Here");
		lblname.setForeground(new Color(102, 0, 0));
		lblname.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblname.setBounds(10, 182, 257, 43);
		contentPane.add(lblname);
		
		txtname = new JTextField();
		txtname.setToolTipText("Enter your name");
		txtname.setBounds(316, 182, 271, 59);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setIcon(new ImageIcon(Demo.class.getResource("/contactapp/images/pic2.JPG")));
		btnsubmit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnsubmit.setForeground(new Color(153, 0, 0));
		btnsubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnsubmit.setBounds(408, 350, 216, 59);
		contentPane.add(btnsubmit);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(0, 0, 815, 725);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Category", "Friend", "Relative", "Teacher", "Collegue"}));
		comboBox.setBounds(156, 319, 265, 22);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.RED, 4));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(156, 452, 544, 191);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textArea.setColumns(20);
		textArea.setLineWrap(true);
		textArea.setRows(5);
		scrollPane.setViewportView(textArea);
		
		
	}
}
