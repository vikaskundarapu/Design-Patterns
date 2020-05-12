package creational.prototype.example2.client;

import creational.prototype.example2.product.MachineImage;

/**
 * 
 * Most of the cloud platforms behave like Prototype pattern to create instances
 * quickly upon requests. This is achieved with the help of pre-installed
 * Machine Images. When a customer wants a Windows or Linux instance, the cloud
 * software just loads the already created machine image on to a server hardware
 * (rather than going through the complete installation process). This saves a
 * lot of time.
 * 
 */
public class MachineImageClient {

	public static void testUsingCloneMethod() throws CloneNotSupportedException {
		/* Create base Machine Images */
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
		MachineImage windowsVM = new MachineImage("Windows", "MaAfee");

		/* Clone Linux VM and Install Web Server */
		MachineImage webServer = linuxVM.clone();
		webServer.installSoftware("Web Server S/W");

		/*
		 * Create a copy of the Web Server and install Application server on top of it
		 */
		MachineImage webAppServer = webServer.clone();
		webAppServer.installSoftware("App Server S/W");

		/* Clone Linux VM and Install DB Server */
		MachineImage dbServer = linuxVM.clone();
		dbServer.installSoftware("DatabaseServerS/W");

		/* Create a test machine from Windows Image */
		MachineImage testMachine = windowsVM.clone();

		webServer.displayInstalledSoftwares();
		webAppServer.displayInstalledSoftwares();
		dbServer.displayInstalledSoftwares();
		testMachine.displayInstalledSoftwares();
	}

	public static void testUsingCopyConstructor() throws CloneNotSupportedException {
		/* Create base Machine Images */
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
		MachineImage windowsVM = new MachineImage("Windows", "MaAfee");

		/* Clone Linux VM and Install Web Server */
		MachineImage webServer = new MachineImage(linuxVM);
		webServer.installSoftware("Web Server S/W");

		/*
		 * Create a copy of the Web Server and install Application server on top of it
		 */
		MachineImage webAppServer = new MachineImage(webServer);
		webAppServer.installSoftware("App Server S/W");

		/* Clone LinuxVM and Install DBServer */
		MachineImage dbServer = new MachineImage(linuxVM);
		dbServer.installSoftware("DatabaseServerS/W");

		/* Create a test machine from Windows Image */
		MachineImage testMachine = new MachineImage(windowsVM);

		webServer.displayInstalledSoftwares();
		webAppServer.displayInstalledSoftwares();
		dbServer.displayInstalledSoftwares();
		testMachine.displayInstalledSoftwares();
	}

	public static void testUsingCopyFactory() throws CloneNotSupportedException {
		/* Create base Machine Images */
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
		MachineImage windowsVM = new MachineImage("Windows", "MaAfee");

		/* Clone Linux VM and Install Web Server */
		MachineImage webServer = MachineImage.machineImageFactory(linuxVM);
		webServer.installSoftware("Web Server S/W");

		/*
		 * Create a copy of the Web Server and install Application server on top of it
		 */
		MachineImage webAppServer = MachineImage.machineImageFactory(webServer);
		webAppServer.installSoftware("App Server S/W");

		/* Clone LinuxVM and Install DBServer */
		MachineImage dbServer = MachineImage.machineImageFactory(linuxVM);
		dbServer.installSoftware("DatabaseServerS/W");

		/* Create a test machine from Windows Image */
		MachineImage testMachine = MachineImage.machineImageFactory(windowsVM);

		webServer.displayInstalledSoftwares();
		webAppServer.displayInstalledSoftwares();
		dbServer.displayInstalledSoftwares();
		testMachine.displayInstalledSoftwares();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		testUsingCloneMethod();
		testUsingCopyConstructor();
		testUsingCopyFactory();
	}

}
