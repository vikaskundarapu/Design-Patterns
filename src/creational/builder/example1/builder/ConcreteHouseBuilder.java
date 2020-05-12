package creational.builder.example1.builder;

import creational.builder.example1.product.House;

public class ConcreteHouseBuilder implements HouseBuilder {

	private static final String CONCRETE = "concrete";
	private House house;

	public ConcreteHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType(CONCRETE);
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWallType(CONCRETE);
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType(CONCRETE);
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}
