//Author Name: Rebecca Steffan
//Date: 1/16/2020
//Program Name: Steffan_Drone
//Purpose: Simulation using button, drone movement in x,y,z location
// 

package ch1;

/**
 * Class that contains drone movement
 * 
 * @author steffan
 *
 */
public class Drone {
	private static final int NORTH = 0;
	private static final int EAST = 1;
	private static final int SOUTH = 2;
	private static final int WEST = 3;

	private int droneX = 0;
	private int droneY = 0;
	private int droneZ = 0;
	private int droneDirection;

	/**
	 * Gets the drones current direction
	 * 
	 * @return drone direction
	 */
	public int getDroneDirection() {
		return this.droneDirection;
	}

	/**
	 * Sets the new direction of drone
	 * 
	 * @param direction of drone
	 */
	public void setDroneDirection(int direction) {
		this.droneDirection = direction;
	}

	/**
	 * Gets the string of the drones current direction
	 * 
	 * @return string of drone direction
	 */
	public String getDirectionDescription() {
		int direction = this.getDroneDirection();
		if (direction == NORTH) {
			return "North";
		}
		if (direction == SOUTH) {
			return "South";
		}
		if (direction == WEST) {
			return "West";
		}
		if (direction == EAST) {
			return "East";
		}
		return "";
	}

	/**
	 * Moves the drone up the Y axis by increments of 1
	 */
	public void moveUp() {
		this.droneY++;
		System.out.println("You moved Up \n");
	}

	/**
	 * Moves the drone down the Y axis by increments of 1
	 */
	public void moveDown() {
		this.droneY--;
		System.out.println("You moved Down \n");
	}

	/**
	 * Moves the drone forward on the corresponding axis based on drones current
	 * direction
	 */
	public void moveForward() {
		int direction = this.getDroneDirection();
		if (direction == NORTH) {
			this.droneX++;
		} else if (direction == EAST) {
			this.droneZ++;
		} else if (direction == SOUTH) {
			this.droneX--;
		} else if (direction == WEST) {
			this.droneZ--;
		}
		System.out.println("You moved forward \n");
	}

	/**
	 * Moves the drone backward on the corresponding axis bases on drones current
	 * direction
	 */
	public void moveBackward() {
		int direction = this.getDroneDirection();
		if (direction == NORTH) {
			this.droneX--;
		} else if (direction == EAST) {
			this.droneZ--;
		} else if (direction == SOUTH) {
			this.droneX++;
		} else if (direction == WEST) {
			this.droneZ++;
		}
		System.out.println("You moved backward \n");
	}

	/**
	 * Points the drone in the direction to the left of the current direction
	 */
	public void turnLeft() {
		int direction = this.getDroneDirection();
		if (direction == NORTH) {
			setDroneDirection(WEST);
		} else if (direction == WEST) {
			setDroneDirection(SOUTH);
		} else if (direction == SOUTH) {
			setDroneDirection(EAST);
		} else if (direction == EAST) {
			setDroneDirection(NORTH);
		}
		System.out.println("You turned Left \n");
	}

	/**
	 * Points the drone in the direction to the right of the current direction
	 */
	public void turnRight() {
		int direction = this.getDroneDirection();
		if (direction == NORTH) {
			setDroneDirection(EAST);
		} else if (direction == WEST) {
			setDroneDirection(NORTH);
		} else if (direction == SOUTH) {
			setDroneDirection(WEST);
		} else if (direction == EAST) {
			setDroneDirection(SOUTH);
		}
		System.out.println("You turned Right \n");
	}

	/**
	 * Prints the drones current position and direction
	 */
	public void printDronePosition() {
		System.out.println(
				"Your drone is at the coordinates(x,y,z): " + this.droneX + ", " + this.droneY + ", " + this.droneZ);
		System.out.println("and is currently facing: " + getDirectionDescription() + ".\n");
	}
}