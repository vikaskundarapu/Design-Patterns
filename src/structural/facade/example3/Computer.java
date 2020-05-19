package structural.facade.example3;

public class Computer {

	public void checkConnections() {
		System.out.println("Two beeps! Connections are all proper");
	}

	public void loadProfiles() {
		System.out.println("Loading screen...");
	}

	public void displayWhenReady() {
		System.out.println("Computer is now ready to use!");
	}

	public void closeApps() {
		System.out.println("Closing all the apps");
	}

	public void saveData() {
		System.out.println("Saving the data...");
	}

	public void cutCurrentToTerminals() {
		System.out.println("Computer is now off!");
	}

}
