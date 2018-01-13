import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;

public class LoginWindow extends JFrame {
	
	public static int WIDTH = 1100;
	public static int HEIGHT = 600;	
	
	public LoginWindow() {
		
		Color grayColor = new Color(31, 33, 35);
		Font myFont = new Font("Calibri", Font.BOLD, 20);
		
		setUndecorated(true);
		setSize(WIDTH, HEIGHT);
		setTitle("Calculator");
		
		setLayout(new GridLayout(1, 2));
		
		URL url = Main.class.getResource("/USlogo.jpg");
		ImageIcon image = new ImageIcon(url);
		JLabel imgContainer = new JLabel("", image, JLabel.CENTER);
		JPanel leftPanel = new JPanel(new BorderLayout());
		leftPanel.add(imgContainer, BorderLayout.CENTER);
		
		JPanel rightPanel = new JPanel();		
		rightPanel.setBackground(grayColor);
		rightPanel.setLayout(new BorderLayout());
		
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1, 1));
		
		//Close and Minimize button Panel
		JPanel windowButtons = new JPanel();
		windowButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		windowButtons.setBackground(grayColor);

		
		//Close Button
		JButton close = new JButton("X");
		close.setBackground(new Color(65, 65, 65));
		close.setForeground(Color.WHITE);
		close.setOpaque(true);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		//close.setContentAreaFilled(false);

		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//Minimize Button
		JButton minimize = new JButton("—");
		minimize.setBackground(new Color(65, 65, 65));
		minimize.setForeground(Color.WHITE);
		minimize.setOpaque(true);
		minimize.setBorderPainted(false);
		minimize.setFocusPainted(false);
		//minimize.setContentAreaFilled(false);
		minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		
		windowButtons.add(minimize);
		windowButtons.add(close);
		northPanel.add(windowButtons);
		
		rightPanel.add(northPanel, BorderLayout.NORTH);
		
		JPanel loginContainer = new JPanel();
		loginContainer.setLayout(new BorderLayout());
		loginContainer.setBackground(grayColor);
		
		JPanel loginBox = new JPanel();
		loginBox.setLayout(new BoxLayout(loginBox, BoxLayout.PAGE_AXIS));
		//loginBox.setBackground(Color.ORANGE);
		loginBox.setBackground(grayColor);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(52, 73, 99));
		nameLabel.setFont(new Font("Calibri", Font.BOLD, 18));
	
		loginBox.add(nameLabel);	
		loginBox.add(Box.createVerticalStrut(5));
		
		JTextField nameField = new JTextField();
		nameField.setMaximumSize(new Dimension(1000, 30));
		nameField.setForeground(Color.WHITE);
		nameField.setBackground(grayColor);
		nameField.setFont(myFont);
		nameField.setCaretColor(Color.WHITE);
		nameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));

		loginBox.add(nameField);
		loginBox.add(Box.createVerticalStrut(25));
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setForeground(new Color(52, 73, 99));
		passLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		
		loginBox.add(passLabel);	
		loginBox.add(Box.createVerticalStrut(5));	
		
		JPasswordField passField = new JPasswordField();
		passField.setMaximumSize(new Dimension(1000, 30));
		passField.setForeground(Color.WHITE);
		passField.setBackground(grayColor);
		passField.setFont(myFont);
		passField.setCaretColor(Color.WHITE);
		passField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		loginContainer.add(loginBox, BorderLayout.CENTER);
		loginContainer.setBorder(BorderFactory.createEmptyBorder(150, 80, 50, 80));
		rightPanel.add(loginContainer, BorderLayout.CENTER);
		
		loginBox.add(passField);
		loginBox.add(Box.createVerticalStrut(30));
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setMaximumSize(new Dimension(1000, 40));
		loginBtn.setBackground(new Color(229, 118, 0));
		loginBtn.setFocusPainted(false);
		loginBtn.setBorderPainted(false);
	
		loginBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchPage sp = new SearchPage(nameField.getText());
				
			}	
			
		});
		
		loginBox.add(loginBtn);
		loginBox.add(Box.createVerticalStrut(5));
		
		JLabel author = new JLabel("Made by : Vineet Koppalkar");

		loginBox.add(author);
		
		add(leftPanel);
		add(rightPanel);		
		
		//Centers window in the screen
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
	    
	    setVisible(true);
	}	
}
