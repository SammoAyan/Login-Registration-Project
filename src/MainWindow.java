import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
      public MainWindow(){
    	  
    	setSize(800,400);
  		setLocationRelativeTo(null);
  		setLayout(null);
  		
  		JLabel lbl = new JLabel(" WELCOME ");
  		add(lbl);
  		
  		
  		setVisible(true);
  		
      }
}