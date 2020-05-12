package creational.builder.example1.builder;

import creational.builder.example1.product.House;

public interface HouseBuilder {

	HouseBuilder buildFloor();

	HouseBuilder buildWall();

	HouseBuilder buildRoof();

	House build();
}
