package loops;

import javax.swing.JOptionPane;

public class YaersAlive {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your age?");
	int answer2 = Integer.parseInt(answer);
	String answer3 = JOptionPane.showInputDialog("Has your birthday happened?");
	if(answer3.equals("no")) {
		answer2++;
	}
	if(answer3.equals("No")) {
		answer2++;
	}
	if(answer3.equals("NO")) {
		answer2++;
	}
	int number = 2017 - answer2;
	for(int i = number;i<2018;i++) {
		System.out.println(i);
	}
}
}
