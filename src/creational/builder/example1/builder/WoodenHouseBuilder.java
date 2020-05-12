package creational.builder.example1.builder;

import creational.builder.example1.product.House;

public class WoodenHouseBuilder implements HouseBuilder {

	private static final String WOOD = "wood";
	private House house;

	public WoodenHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType(WOOD);
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWallType(WOOD);
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType(WOOD);
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}
