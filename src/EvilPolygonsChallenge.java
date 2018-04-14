import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot r2d2=new Robot();
		//2. Set the speed to 100
r2d2.setX(50);
r2d2.setY(300);
r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Hello! What color do you want your polygons?", "Color Chooser", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Purple","Green","Blue","Yellow","Random Color"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if(colorChoice==0) {
			r2d2.setPenColor(252,13,13);
		}
		else if(colorChoice==1) {
			r2d2.setPenColor(200,13,252);
		}
		else if(colorChoice==2) {
			r2d2.setPenColor(63,252,13);
		}
		else if(colorChoice==3) {
			r2d2.setPenColor(15,24,242);
		}
		else if(colorChoice==4) {
			r2d2.setPenColor(248,252,3);
		}
		else if(colorChoice==5) {
			r2d2.setRandomPenColor();
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons=JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		int num=Integer.parseInt(polygons);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < num; i++) {
			r2d2.penDown();
			r2d2.move(50);
			r2d2.turn(45);
			r2d2.move(50);
			r2d2.turn(90);
			r2d2.move(50);
			r2d2.turn(45);
			r2d2.move(50);
			r2d2.turn(90);
			r2d2.move(70);
			r2d2.penUp();
			r2d2.turn(180);
			r2d2.move(100);
			r2d2.turn(-90);
		}
		r2d2.sparkle();
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

