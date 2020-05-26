package behavioral.memento.example1.client;

import behavioral.memento.example1.caretaker.RecoveryTool;
import behavioral.memento.example1.originator.Os;

/**
 * When to use: To take snapshots and restore an object back to its previous
 * state (e.g. "undo" or "rollback" operations). Intent Without violating
 * encapsulation, capture and externalize an object's internal state so that the
 * object can be restored to this state later.
 * 
 * Components: 1) Originator - the object that knows how to save itself. 2)
 * Caretaker - the object that knows why and when the Originator needs to save
 * and restore itself. 3) Memento - the lockbox that is written and read by the
 * Originator, and shepherded by the Caretaker. Structure
 * 
 * Implementation: The memento design pattern is used when the object state
 * needs to be saved so that it can be restored later. Memento pattern
 * implements this in a way that the saved state data of the object is not
 * accessible outside of the object, thus protecting the integrity of saved
 * state data.
 */
public class OsRecoveryClient {

	public static void main(String[] args) {
		/* Create an OS */
		Os os = new Os("Windows 10 Pro");

		/* Install a basic software */
		os.installSoftware("McAfee Antivirus");

		/* Create an OS recovery tool */
		RecoveryTool recoveryTool = new RecoveryTool();

		/* Save image for future restoration */
		recoveryTool.addImage(os.saveImage());

		/* Install more softwares */
		os.installSoftware("Tomcat server");

		/* Save image for future restoration */
		recoveryTool.addImage(os.saveImage());

		/* Install more softwares */
		os.installSoftware("MySQL");

		/* OS CORRUPTED */
		/* Restore the last good configuration */
		os.restoreImage(recoveryTool.getLastWorkingImage());
		System.out.println(os);

		/*
		 * OS CORRUPTED AGAIN. Delete the last image & restore the previous good
		 * configuration
		 */
		recoveryTool.deleteLastImage();
		os.restoreImage(recoveryTool.getLastWorkingImage());
		System.out.println(os);

	}

}
