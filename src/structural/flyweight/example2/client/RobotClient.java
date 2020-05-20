package structural.flyweight.example2.client;

import java.util.Random;

import structural.flyweight.example2.robot.Robot;
import structural.flyweight.example2.robotpool.RobotFactory;

public class RobotClient {

	static String getRandomColor() {
		Random r = new Random();
		/*
		 * You can supply any number of your choice in nextInt argument. we are simply
		 * checking the random number generated is an even number or an odd number. And
		 * based on that we are choosing the color. For simplicity, we’ll use only two
		 * colors—red and green
		 */
		int random = r.nextInt(20);
		if (random % 2 == 0) {
			return "red";
		} else {
			return "green";
		}
	}

	public static void main(String[] args) throws Exception {

		Robot robot = null;

		/* Here we are trying to get 3 C-3PO type robots */
		for (int i = 0; i < 3; i++) {
			robot = RobotFactory.getRobot("C-3PO");
			robot.setColor(getRandomColor());
			robot.attack();
		}

		/* Here we are trying to get 3 R2-D2 type robots */
		for (int i = 0; i < 3; i++) {
			robot = RobotFactory.getRobot("R2-D2");
			robot.setColor(getRandomColor());
			robot.attack();
		}

		int robotsCreated = RobotFactory.objectsCreated();
		System.out.println("\nFinally no of Distinct Robot objects created: " + robotsCreated);
	}
}
