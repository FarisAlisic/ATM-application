package MainClass;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Credits {
	public void stateView()  {
		Commons commons = new Commons();
		JFrame frame = (JFrame)commons.Frame();
		
		JLabel label = new JLabel("Application made by Faris Alisic!");
		label.setBounds(20, 300, 575, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Rockwell", Font.BOLD, 25));
		
		JLabel label2 = new JLabel("GitHub name: FarisAlisic");
		label2.setBounds(20, 350, 575, 30);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setFont(new Font("Rockwell", Font.BOLD, 25));
		
		JLabel label3 = new JLabel("Email: alisic.faris@gmail.com");
		label3.setBounds(20, 400, 575, 30);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setFont(new Font("Rockwell", Font.BOLD, 25));
		
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		
		frame.setVisible(true);
	}
}