import java.sql.*;

import javax.swing.JOptionPane;




public class DBConnection {
	
	private Connection con;
	private Statement st;
	private ResultSet res;
	private int flag =0;
	
	public DBConnection() {
		
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
			st = con.createStatement();
		  	  } 
		  
		  catch (Exception e) {
			System.out.println("Error:"+e);
		      }
	}

	public void RegisterInsert(String queryInsert) {
		
		try {
			st.executeUpdate(queryInsert);
			
			JOptionPane.showMessageDialog(null," Registrstion is Complete.");
			
		    } 
		
		catch (Exception e) {
			
	       JOptionPane.showMessageDialog(null,"Registration is not Complete." +e);	
			
		   }
		}

	public void Login(String queryLogin,String userName,String pass) {
		try {
			res =st.executeQuery(queryLogin);
			
			while(res.next()){
				
				String tableUserName = res.getString(2);
				String tablePass = res.getString(4);
				
				
				if(userName.equals(tableUserName) && pass.equals(tablePass)) {
					
					JOptionPane.showMessageDialog(null,"Valid User");
					flag=1;
					
					new MainWindow();
					break;
				}
				}
			
			if(flag==0) {				
					JOptionPane.showMessageDialog(null, "Not a Valid User");
					}
			}
		
		catch(Exception e){
			
		}
		}
	}
