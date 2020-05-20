package structural.flyweight.example2.robotpool;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.example2.robot.HumanFriendlyRobot;
import structural.flyweight.example2.robot.Robot;

public class RobotFactory {

	private static final String R2_D2 = "R2-D2";
	private static final String C_3PO = "C-3PO";
	private static final Map<String, Robot> robots = new HashMap<>();
	
	private RobotFactory() {}

	public static int objectsCreated() {
		return robots.size();
	}

	public static Robot getRobot(String robotType) throws Exception {
		Robot robot = null;
		if (robots.containsKey(robotType)) {
			robot = robots.get(robotType);
		} else {
			switch (robotType) {
			case C_3PO:
				System.out.println("We do not have a C_3PO Robot.  Creating a C_3PO Robot now");
				robot = new HumanFriendlyRobot(C_3PO);
				robots.put(C_3PO, robot);
				break;
			case R2_D2:
				System.out.println("We do not have a R2_D2 Robot.  Creating a R2_D2 Robot now");
				robot = new HumanFriendlyRobot(R2_D2);
				robots.put(R2_D2, robot);
				break;
			default:
				throw new Exception(" Robot Factory can create only C_3PO and R2_D2 Robots");
			}
		}

		return robot;
	}

}
