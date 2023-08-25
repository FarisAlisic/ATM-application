package MainClass;

import javax.swing.*;
import java.awt.*;

public class Commons {
	public Component Frame() {
		JFrame frame = new JFrame();
		frame.setSize(650, 650);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#C26F6F"));
		
		//------------------LOGO----------------------------------
		
		JLabel card = new JLabel("CARD");
		card.setBounds(80, -75, 250, 300);
		card.setHorizontalAlignment(JLabel.CENTER);
		card.setFont(new Font("Serif", Font.BOLD, 70));
		
		JLabel to = new JLabel("TO");
		to.setBounds(185, 35, 200, 200);
		to.setHorizontalAlignment(JLabel.CENTER);
		to.setFont(new Font("Serif", Font.BOLD, 30));
		 
		JLabel arrow1 = new JLabel("|");
		arrow1.setBounds(30, 111, 250, 85);
		arrow1.setHorizontalAlignment(JLabel.CENTER);
		arrow1.setFont(new Font("Serif", Font.BOLD, 130));
		
		JLabel arrow2 = new JLabel("_");
		arrow2.setBounds(60, 30, 250, 180);
		arrow2.setHorizontalAlignment(JLabel.CENTER);
		arrow2.setFont(new Font("Serif", Font.BOLD, 130));
		
		JLabel arrow3 = new JLabel(">");
		arrow3.setBounds(110, 145, 250, 85);
		arrow3.setHorizontalAlignment(JLabel.CENTER);
		arrow3.setFont(new Font("Serif", Font.BOLD, 110));
		
		JLabel money = new JLabel("CASH");
		money.setBounds(235, 40, 300, 300);
		money.setHorizontalAlignment(JLabel.CENTER);
		money.setFont(new Font("Serif", Font.BOLD, 70));
		
		JLabel arrow4 = new JLabel("|");
		arrow4.setBounds(310, 71, 250, 85);
		arrow4.setHorizontalAlignment(JLabel.CENTER);
		arrow4.setFont(new Font("Serif", Font.BOLD, 130));
		
		JLabel arrow5 = new JLabel("_");
		arrow5.setBounds(280, -85, 250, 180);
		arrow5.setHorizontalAlignment(JLabel.CENTER);
		arrow5.setFont(new Font("Serif", Font.BOLD, 130));
		
		JLabel arrow6 = new JLabel("<");
		arrow6.setBounds(230, 30, 250, 85);
		arrow6.setHorizontalAlignment(JLabel.CENTER);
		arrow6.setFont(new Font("Serif", Font.BOLD, 110));
		
		frame.add(card);
		frame.add(to);
		frame.add(arrow1);
		frame.add(arrow2);
		frame.add(arrow3);
		frame.add(arrow4);
		frame.add(arrow5);
		frame.add(arrow6);
		frame.add(money);
		return frame;
	}
}
