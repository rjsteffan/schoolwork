//Author Name: Rebecca Steffan
//Date: 1/16/2020
//Program Name: Steffan_Drone
//Purpose: Simulation using button, drone movement in x,y,z location
// 

package ch1;

import java.util.Scanner;

/**
 * Contains main to start while loop to control the drone
 * 
 * @author steffan
 *
 */
public class Steffan_Drone {
	public static void main(String[] args) {
		// Initialize a new drone
		Drone steffanDrone = new Drone();
		// Initialize new scanner
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Which direction would you like to move the drone?");
			System.out.println("1 - Move Up \n2 - Move Down \n3 - Move Forward \n4 - Move Backward "
					+ "\n5 - Turn Left \n6 - Turn Right \n7 - Display Position \n8 - Exit Navigation \n");
			switch (input.nextInt()) {
			case 1:
				steffanDrone.moveUp();
				break;
			case 2:
				steffanDrone.moveDown();
				break;
			case 3:
				steffanDrone.moveForward();
				break;
			case 4:
				steffanDrone.moveBackward();
				break;
			case 5:
				steffanDrone.turnLeft();
				break;
			case 6:
				steffanDrone.turnRight();
				break;
			case 7:
				steffanDrone.printDronePosition();
				break;
			case 8:
				System.out.println("Thank you for using Steffan_Drone! Please come back soon!");
				return;
			}
		} // end of while
	}// end of main
}// end of class