package MainClass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Operations {
	
	public void opView(String str, String cardNum) {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		Font txt = new Font("", Font.BOLD, 15);
		JLabel label = new JLabel("Enter the " + str);
		label.setBounds(50, 270, 250, 20);
		label.setFont(txt);
		JTextField amt = new JTextField();
		amt.setBounds(50, 300, 500, 35);
		amt.setFont(txt);
		frame.add(label);
		frame.add(amt);
		JButton sbt = new JButton("SUBMIT");
		sbt.setBounds(200, 400, 200, 50);
		sbt.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sbt);
		sbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(str.equals("Withdraw Amount")) {
					Database data = new Database();
					data.withdrawal(Integer.parseInt(amt.getText()), cardNum);
					frame.dispose();
				}
				else if(str.equals("Deposit Amount")) {
					Database data = new Database();
					data.deposit(Integer.parseInt(amt.getText()), cardNum);
					frame.dispose();
					
				}
				else if(str.equals("New PIN")){
					Database data = new Database();
					data.pinchange(amt.getText(), cardNum);
					frame.dispose();
				}
			}
		});
		if (str.equals("Balance")){
			amt.setVisible(false);
			sbt.setVisible(false);
			label.setText("Your Balance is : ");
			Database data = new Database();
			JLabel bal = new JLabel(data.balCheck(cardNum));
				bal.setBounds(0, 325, 600, 20);
				bal.setHorizontalAlignment(JLabel.CENTER);
				bal.setFont(new Font("", Font.BOLD, 25));
				frame.add(bal);
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
		frame.setVisible(true);
	}
}