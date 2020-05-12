package creational.builder.example1.product;

public class House {

	private String floorType;
	private String wallType;
	private String roofType;

	public String getFloorType() {
		return floorType;
	}

	public String getWallType() {
		return wallType;
	}

	public String getRoofType() {
		return roofType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public void setWallType(String wallType) {
		this.wallType = wallType;
	}

	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}

	@Override
	public String toString() {
		return "House [floorType=" + floorType + ", wallType=" + wallType + ", roofType=" + roofType + "]";
	}

}
