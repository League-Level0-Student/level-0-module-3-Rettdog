package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot jim = new Robot();
	static String color = "";
public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("What shape do you want? We have square, triangle, and circle.");
	color = JOptionPane.showInputDialog("What color do you want? We have red, yellow, green, blue, magenta, and light blue.");
	if(color.equals("red")) {
		jim.setPenColor(255, 0, 0);
	}else if(color.equals("yellow")) {
		jim.setPenColor(255, 255, 0);
	}else if(color.equals("green")) {
		jim.setPenColor(0, 255, 0);
	}else if(color.equals("blue")) {
		jim.setPenColor(0, 0, 255);
	}else if(color.equals("magenta")) {
		jim.setPenColor(255, 0, 255);
	}else if(color.equals("light blue")) {
		jim.setPenColor(0, 255, 255);
	}else{
		JOptionPane.showMessageDialog(null, "We don't have that color");
	}
	if(shape.equals("square")) {
		drawSquare();
	}else if(shape.equals("triangle")) {
		drawTriangle();
	}else if(shape.equals("circle")) {
		drawCircle();
	}else {
		JOptionPane.showMessageDialog(null, "We don't have that shape");
	}
}

public static void drawSquare(){
	
	jim.penDown();
	jim.setSpeed(555);
	for(int i = 0;i<4;i++) {
	jim.move(50);
	jim.turn(90);
	}
	jim.hide();
}
public static void drawTriangle(){
	
	jim.setSpeed(555);
	jim.penDown();
	for(int i = 0;i<3;i++) {
		jim.move(50);
		jim.turn(120);
		}
	jim.hide();
}
public static void drawCircle(){
	
	jim.setSpeed(555);
	jim.penDown();
	for(int i = 0;i<36;i++) {
		jim.move(5);
		jim.turn(10);
		}
	jim.hide();
}
}