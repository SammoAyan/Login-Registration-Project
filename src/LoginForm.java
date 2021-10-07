import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginForm extends JFrame{
	public void LOginForm() {
		setSize(500,300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JPanel headerPanel=new JPanel();
		headerPanel.setBackground(Color.GREEN);
		headerPanel.setBounds(5,5,490,60);
		add(headerPanel);
		
		JLabel headerText = new JLabel("LOGIN FORM ");
		headerPanel.add(headerText);
		
		JPanel inputPanel=new JPanel();
		inputPanel.setBackground(Color.YELLOW);
		inputPanel.setBounds(5,5,490,425);
		inputPanel.setLayout(null);
		add(inputPanel);
		
		JLabel nameLabel = new JLabel("Username : ");
		nameLabel.setBounds(90,12,100,25);		  
		inputPanel.add(nameLabel);
		
		JTextField nameText = new JTextField();
	    nameText.setBounds(200,12,200,25);  
	    inputPanel.add(nameText);
	    
	    JLabel passLabel = new JLabel("Password : ");
	    passLabel.setBounds(95,50,100,25);
	    inputPanel.add(passLabel);
		 
	    JTextField passText = new JTextField();
	    passText.setBounds(200,50,200,25);
	    inputPanel.add(passText);
	    
	    JButton registerBtn = new JButton("Register");
	    registerBtn.setBounds(300,120,100,30);
	    registerBtn.setBackground(Color.WHITE);
	    registerBtn.setForeground(Color.BLACK);
	    inputPanel.add(registerBtn);
	    
	    JButton loginBtn = new JButton("LOGIN");
	    loginBtn.setBounds(170,120,100,30);
	    loginBtn.setBackground(Color.WHITE);
	    loginBtn.setForeground(Color.BLUE);
	    inputPanel.add(loginBtn);
	    
		registerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  dispose();
			  new RegForm();
				
			}
		});	
		
	    
		
		
		
		
 	    setVisible(true);
	}
	
}
