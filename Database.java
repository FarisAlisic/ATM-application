package MainClass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Database {
	
	private static Map<String, String[]> cardPinMap = new HashMap<>(); 

	
    public void addCardInfo(String name, String cardNumber, String pin, String bal) {
        cardPinMap.put(cardNumber, new String[] { pin, name, bal });
    }
    
    public void changeBal(String cardNumber,int bal) {
    	String[] cardData = cardPinMap.get(cardNumber);
    	cardData[2]=Integer.toString(bal);
    	cardPinMap.put(cardNumber, new String[] { cardData[0], cardData[1], cardData[2] });
    }

    
    public String getPinByCardNumber(String cardNumber) {
        String[] cardData = cardPinMap.get(cardNumber);
        if (cardData != null) {
            return cardData[0]; // Index 0 corresponds to the PIN
        }
        return null; // Card number not found
    }
    
    
    public void withdrawal(int amount, String cardNum) {
    	String[] cardData = cardPinMap.get(cardNum);
    	int bal=(Integer.parseInt(cardData[2]))-amount;
    	if (bal<0) {
    		Commons commons = new Commons();
    		JFrame frame = (JFrame)commons.Frame();
    		JLabel label = new JLabel("Insufficient amount on your card!");
    		label.setFont(new Font("Serif", Font.BOLD, 30));
    		label.setBounds(50, 300, 500, 35);
    		label.setHorizontalAlignment(JLabel.CENTER);
    		frame.add(label);
    		frame.setVisible(true);
    		JButton cont = new JButton("COUNTINUE");
    		cont.setBounds(200, 400, 200, 50);
    		cont.setFont(new Font("Rockwell", Font.BOLD, 25));
    		frame.add(cont);
    		cont.addActionListener(new ActionListener() {
    			@Override
    			public void actionPerformed(ActionEvent e) {
    					frame.dispose();
    					Login login = new Login();
    					login.loginView();
    				}
    			
    		});
    	}
    	else {
    		changeBal(cardNum, bal);
    	Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		JLabel label = new JLabel("Here is your money, thank you!");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setBounds(50, 300, 500, 35);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		frame.setVisible(true);
    	JButton cont = new JButton("COUNTINUE");
		cont.setBounds(200, 400, 200, 50);
		cont.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(cont);
		cont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
					Login login = new Login();
					login.loginView();
				}
			
		});
    	}
	}
    
    public void deposit(int amount, String cardNum) {
    	String[] cardData = cardPinMap.get(cardNum);
    	int bal=(Integer.parseInt(cardData[2]))+amount;
    	changeBal(cardNum, bal);
    	Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		JLabel label = new JLabel("You deposited: " + Integer.toString(amount));
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setBounds(50, 300, 500, 35);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		frame.setVisible(true);
    	JButton cont = new JButton("COUNTINUE");
		cont.setBounds(200, 400, 200, 50);
		cont.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(cont);
		cont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
					Login login = new Login();
					login.loginView();
				}
			
		});
    }
    
    public void pinchange(String newPin,String cardNum) {
    	String[] cardData = cardPinMap.get(cardNum);
    	cardData[0]=newPin;
    	cardPinMap.put(cardNum, new String[] { cardData[0], cardData[1], cardData[2] });
    	Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		JLabel label = new JLabel("You successfully changed your PIN!");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setBounds(50, 300, 500, 35);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		frame.setVisible(true);
    	JButton cont = new JButton("COUNTINUE");
		cont.setBounds(200, 400, 200, 50);
		cont.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(cont);
		cont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
					Login login = new Login();
					login.loginView();
				}
			
		});
    }
    
    public String balCheck(String cardNum) {
    	String[] cardData = cardPinMap.get(cardNum);
    	return cardData[2];
    }
    
}
