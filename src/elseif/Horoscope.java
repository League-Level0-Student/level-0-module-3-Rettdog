package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is you horoscope.");
	if(answer.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Mar 20 - Apr 20");
	}else if(answer.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Apr 20 – May 21");
	}else if(answer.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is May 21 – Jun 21");
	}else if(answer.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Jun 21 – Jul 23\n" + 
				"");
	}else if(answer.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Jul 23 – Aug 23\n" + 
				"");
	}else if(answer.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Sep 23 – Oct 23\n" + 
				"");
	}else if(answer.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Oct 23 – Nov 22\n" + 
				"");
	}else if(answer.equals("Sagittarrius")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Nov 22 – Dec 22");
	}else if(answer.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Dec 23 – Jan 20\n" + 
				"");
	}else if(answer.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Jan 20 – Feb 18");
	}else {
		JOptionPane.showMessageDialog(null, "That isn't a zodiac sign");
	}
}
}
