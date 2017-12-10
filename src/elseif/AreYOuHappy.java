package elseif;

import javax.swing.JOptionPane;

public class AreYOuHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you happy?");
	if(answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
	}else {
		answer = JOptionPane.showInputDialog("Do you want to be happy?");	
		if(answer.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		}else {
			JOptionPane.showMessageDialog(null, "Change something.");	
			
		}
	}
}
}
