package behavioral.mediator.example1.model;

public class Gate {

	private String gateNumber;
	private boolean isInUse;

	public Gate() {
		super();
	}

	public Gate(String gateNumber, boolean isInUse) {
		super();
		this.gateNumber = gateNumber;
		this.isInUse = isInUse;
	}

	public String getGateNumber() {
		return gateNumber;
	}

	public boolean isInUse() {
		return isInUse;
	}

	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}

	public void setInUse(boolean isInUse) {
		this.isInUse = isInUse;
	}

}
