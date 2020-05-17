package structural.proxy.example2.door;

public class LabDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Fear not! I'll open the door");
	}

	@Override
	public void closeDoor() {
		System.out.println("Fear not! I'll close the door");
	}

}
