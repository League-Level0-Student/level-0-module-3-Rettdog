
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 21nd";
		String dadsBirthday = "february 9th";
		String myBirthday = "August 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int name = JOptionPane.showOptionDialog(null, "Who's birthday do you want to know?", "Birthday Reminder", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Lia", "David", "Garrett" }, null);
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if(name== 2) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
if(name== 1) {
	System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
if(name== 0) {
	System.out.println(myBirthday);
}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
