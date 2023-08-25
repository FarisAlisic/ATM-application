package MainClass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Pin {
    
    Database database = new Database();
    AddUser pinChecker = new AddUser(database);
    
	 public void pinView(String cardNum) {
	        Commons common = new Commons();
	        JFrame frame = (JFrame) common.Frame();
	        Font txt = new Font("", Font.BOLD, 15);

	        // ---------------PASSWORD----------------
	        JLabel pswd = new JLabel("ENTER YOUR PIN");
	        pswd.setBounds(50, 270, 250, 20);
	        pswd.setFont(txt);

	        JPasswordField pswdField = new JPasswordField();
	        pswdField.setBounds(50, 300, 500, 35);
	        pswdField.setFont(txt);

	        frame.add(pswdField);
	        frame.add(pswd);
	        // -----------------------------------------

	        // -----------------BUTTON-----------------
	        JButton cont = new JButton("CONTINUE");
	        cont.setBounds(200, 400, 200, 50);
	        cont.setFont(new Font("Rockwell", Font.BOLD, 25));

	        frame.add(cont);

	        Home home = new Home();
	        Admin admin = new Admin();

	        cont.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Get the entered PIN
	                
	            	
	            	char[] pinChars = pswdField.getPassword();
	                String enteredPin = new String(pinChars);
	            	
	                // Check the entered PIN against valid values
	                if (enteredPin.equals("admin")) {
	                    admin.adminView();
	                    frame.dispose();
	                } 
	                
	                else if (pinChecker.checkPin(cardNum, enteredPin)) {
	                	home.homeView(cardNum);
	                	frame.dispose();
	                }
	                
	                else {
	                frame.dispose();
					Login login = new Login();
					login.loginView();
	                }
	            }
	        });

	        frame.setVisible(true);
	    }

	}