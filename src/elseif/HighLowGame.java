//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		int tries = 0;
		System.out.println(random);
		// 11. do the following 10 times
		for(int i = 0;i < 10;i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
String number = JOptionPane.showInputDialog("Guess");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(number);
			// 5. if the guess is correct
			tries++;
			if(guess==random) {
				JOptionPane.showMessageDialog(null,"You win! It took you "+tries+" tries.");
				System.exit(guess);
			}
				// 6. win
			// 7. if the guess is high
			if(guess>=random) {
				JOptionPane.showMessageDialog(null,"Too high");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			if(guess<=random) {
				JOptionPane.showMessageDialog(null,"Too low");
			}
				// 10. tell them it's too low
			
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
	}

}


