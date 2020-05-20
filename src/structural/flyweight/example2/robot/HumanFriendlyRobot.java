package structural.flyweight.example2.robot;

public class HumanFriendlyRobot implements Robot {

	private final String robotType;

	/* Extrinsic property */
	private String color;
	

	public HumanFriendlyRobot(String name) {
		super();
		this.robotType = name;
	}

	@Override
	public void attack() {
		System.out.println("I " + robotType + " don't attack humans! Beware robots not " + color
				+ " in color. You have a thing coming!");
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

}
