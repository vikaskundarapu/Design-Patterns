package structural.proxy.example2.client;

import structural.proxy.example2.door.Door;
import structural.proxy.example2.door.LabDoor;
import structural.proxy.example2.door.SecuredDoor;

/**
 * Real world example: Have you ever used an access card to go through a door?
 * There are multiple options to open that door i.e. it can be opened either
 * using access card or by pressing a button that bypasses the security. The
 * door's main functionality is to open but there is a proxy added on top of it
 * to add some functionality. Let me better explain it using the code example
 * below.
 * 
 * In plain words:Using the proxy pattern, a class represents the functionality
 * of another class.
 * 
 * Wikipedia says:A proxy, in its most general form, is a class functioning as
 * an interface to something else. A proxy is a wrapper or agent object that is
 * being called by the client to access the real serving object behind the
 * scenes. Use of the proxy can simply be forwarding to the real object, or can
 * provide additional logic. In the proxy extra functionality can be provided,
 * for example caching when operations on the real object are resource
 * intensive, or checking preconditions before operations on the real object are
 * invoked.
 */

public class SecureDoorClient {
	public static void main(String[] args) {
		Door door = new LabDoor();
		SecuredDoor securedDoor = new SecuredDoor(door);
		System.out.println("Normal Lab door opens without a password");
		door.openDoor();
		door.closeDoor();
		System.out.println("****************************************************************************************");

		System.out.println("Secured door open only with a correct password");
		securedDoor.openDoor("secret");
		securedDoor.closeDoor();

		System.out.println("****************************************************************************************");
		securedDoor.openDoor("test");
	}
}
