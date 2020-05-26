package behavioral.memento.example1.originator;

import behavioral.memento.example1.imagememento.RecoveryImage;

/**
 * Create an Originator class. In our example, the operating system s/w is the
 * originator which creates/restores a memento
 */
public class Os {

	private StringBuilder installedSoftwares;

	public Os(String os) {
		super();
		this.installedSoftwares = new StringBuilder(os);
	}

	public void installSoftware(String software) {
		installedSoftwares.append(", ");
		installedSoftwares.append(software);
		System.out.println(installedSoftwares);
	}

	public RecoveryImage saveImage() {
		System.out.println("--Saved OS image--");
		return new RecoveryImage(installedSoftwares.toString());
	}

	public void restoreImage(RecoveryImage image) {
		installedSoftwares = new StringBuilder(image.getSystemImage());
		System.out.println("--Restored OS Image--");
		System.out.println(installedSoftwares);
	}

	@Override
	public String toString() {
		return "Os [installedSoftwares=" + installedSoftwares + "]";
	}

}
