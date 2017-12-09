
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
Robot jim = new Robot();
jim.setSpeed(100);
jim.penDown();
for(int i = 0;i <1;) {
//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like?");
		//4. use an if/else statement to set the pen color that the user requested
if(color.equals("red")) {
	jim.setPenColor(256, 0, 0);
}else if(color.equals("blue")) {
	jim.setPenColor(0,0,256);
}else if(color.equals("green")) {
	jim.setPenColor(0,256,0);
}else if(color.equals("yellow")) {
	jim.setPenColor(255,255,0);
}else {
	jim.setRandomPenColor();
}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		jim.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
for(int j = 0; j <4 ; j ++) {
jim.move(200);
jim.turn(90);
}
	}
	}
}
