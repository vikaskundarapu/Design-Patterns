package creational.builder.example1.director;

import creational.builder.example1.builder.HouseBuilder;
import creational.builder.example1.product.House;

public class HouseBuildDirector {

	private HouseBuilder builder;

	private HouseBuildDirector() {
	}

	public HouseBuildDirector(final HouseBuilder builder) {
		super();
		this.builder = builder;
	}

	public House constructHouse() {
		return builder.buildFloor().buildWall().buildRoof().build();
	}

}
