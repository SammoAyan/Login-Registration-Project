import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RegForm extends JFrame {
	public RegForm() {
    	setSize(500,460);
    	setLocationRelativeTo(null);
    	setLayout(null);
    	
    	
    JPanel headerPanel = new JPanel();
    headerPanel.setBackground(Color.GREEN);
    headerPanel.setBounds(5,5,490,60);
    add(headerPanel);
    
    JLabel headerText = new JLabel("REGISTRATION FORM");
    headerPanel.add(headerText);
    
    JPanel inputPanel = new JPanel();
    inputPanel.setBackground(Color.YELLOW);
    inputPanel.setBounds(5,70,490,425);
    inputPanel.setLayout(null);
    add(inputPanel);
    
    
    JLabel nameLabel = new JLabel("Name: ");
    nameLabel.setBounds(135,5,100,25);
    inputPanel.add(nameLabel); 
    
    JTextField nameText = new JTextField();
    nameText.setBounds(200,5,200,25);
    inputPanel.add(nameText);
         	
    JLabel emailLabel = new JLabel("Mail: ");
    emailLabel.setBounds(135,50,100,25);
    inputPanel.add(emailLabel);
    
    JTextField emailText = new JTextField();
    emailText.setBounds(200,50,200,25);
    inputPanel.add(emailText);  	
         	
    JLabel passLabel = new JLabel("Password: ");
    passLabel.setBounds(105,100,100,25);
    inputPanel.add(passLabel);
    
    JTextField passText = new JTextField();
    passText.setBounds(200,100,200,25);
    inputPanel.add(passText);
    	
    JLabel mobileLabel = new JLabel("Mobile: ");
    mobileLabel.setBounds(130,200,100,25);
    inputPanel.add(mobileLabel);
    
    JTextField mobileText = new JTextField();
    mobileText.setBounds(200,200,200,25);
    inputPanel.add(mobileText); 
    
    JLabel addressLabel = new JLabel("Address: ");
    addressLabel.setBounds(120,250,100,25);
    inputPanel.add(addressLabel);
    
    JTextField addressText = new JTextField();
    addressText.setBounds(200,250,200,25);
    inputPanel.add(addressText); 
    
    JButton registerBtn = new JButton("REGISTER");
    registerBtn.setBounds(300,300,100,30);
    registerBtn.setBackground(Color.WHITE);
    registerBtn.setForeground(Color.BLACK);
    inputPanel.add(registerBtn);
    
    JButton loginBtn = new JButton("LOGIN");
    loginBtn.setBounds(180,300,100,30);
    loginBtn.setBackground(Color.WHITE);
    loginBtn.setForeground(Color.BLUE);
    inputPanel.add(loginBtn);
    
    
    loginBtn.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    		dispose();
    		
    		new LoginForm();	
    		
    	}
    });
    
    
    registerBtn.addActionListener(new ActionListener() {
		@Override
		
		public void actionPerformed(ActionEvent e) {
			String userName = nameText.getText();
			String email = emailText.getText();
			String pass = passText.getText();
			String mobile = mobileText.getText();
			String address = addressText.getText();
			
			DBConnection db = new DBConnection();
			String queryInsert= "INSERT INTO `register`(`username`, `email`, `pass`, `mobile`, `address`) VALUES ('"+userName+"','"+email+"','"+pass+"','"+mobile+"','"+address+"') ";
			db.RegisterInsert(queryInsert);
			
		}
        });
    
    
      
    
    
    
    
    
    
    
    
    setVisible(true);  	
    }

}