package behavioral.mediator.example1.model;

public class Runway {
	private String runwayNumber;
	private boolean isInUse;

	private Runway() {
		super();
	}

	public Runway(String runwayNumber, boolean isInUse) {
		super();
		this.runwayNumber = runwayNumber;
		this.isInUse = isInUse;
	}

	public String getRunwayNumber() {
		return runwayNumber;
	}

	public boolean isInUse() {
		return isInUse;
	}

	public void setRunwayNumber(String runwayNumber) {
		this.runwayNumber = runwayNumber;
	}

	public void setInUse(boolean isInUse) {
		this.isInUse = isInUse;
	}

}
