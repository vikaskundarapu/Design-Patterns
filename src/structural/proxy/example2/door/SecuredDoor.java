package structural.proxy.example2.door;

public class SecuredDoor {

	private final Door door;

	public SecuredDoor(Door door) {
		super();
		this.door = door;
	}

	public void openDoor(String password) {
		if (authenticate(password)) {
			door.openDoor();
		} else {
			System.out.println("Alert the commandos. Security Breach!!!");
		}
	}

	public void closeDoor() {
		door.closeDoor();
	}

	public boolean authenticate(String password) {
		return password.equals("secret");
	}
}
