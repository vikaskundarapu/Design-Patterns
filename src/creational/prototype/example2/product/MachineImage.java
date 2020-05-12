package creational.prototype.example2.product;

/**
 * Create a base machine image by installing the specified OS and antivirus
 * software. Provide a 'clone' method so that client can create an object
 * without using a time consuming 'new' operator every time.
 */
public class MachineImage implements Cloneable {

	private StringBuilder programsInstalled;

	private MachineImage() {
		programsInstalled = new StringBuilder();
	}

	public MachineImage(String softwares) {
		programsInstalled = new StringBuilder(softwares);
	}

	public void installSoftware(String software) {
		programsInstalled.append(software);
		programsInstalled.append("\n");
	}

	public void displayInstalledSoftwares() {
		System.out.println(this.programsInstalled.toString());
	}

	/**
	 * Implementing a clone method is not a perfect way to clone an object. We
	 * should have a copy constructor or a copy factory method to clone an object.
	 * Check the below implementations.
	 */
	@Override
	public MachineImage clone() throws CloneNotSupportedException {
		super.clone();
		return new MachineImage(this.programsInstalled.toString());
	}

	public MachineImage(MachineImage machineImage) {
		this.programsInstalled = new StringBuilder(machineImage.programsInstalled);
	}

	public MachineImage(String operatingSystem, String antiVirus) {
		this();
		programsInstalled.append(operatingSystem);
		programsInstalled.append(" OS: Installed \n");
		programsInstalled.append(antiVirus);
		programsInstalled.append(" Antivirus: Installed \n");

	}

	public static MachineImage machineImageFactory(MachineImage machineImage) {
		return new MachineImage(machineImage.programsInstalled.toString());
	}

	@Override
	public String toString() {
		return "MachineImage [\nprogramsInstalled=" + programsInstalled + "]";
	}

}
