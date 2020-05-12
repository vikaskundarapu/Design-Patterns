package creational.builder.example1.client;

import creational.builder.example1.builder.ConcreteHouseBuilder;
import creational.builder.example1.builder.HouseBuilder;
import creational.builder.example1.builder.WoodenHouseBuilder;
import creational.builder.example1.director.HouseBuildDirector;
import creational.builder.example1.product.House;

public class HouseBuilderClient {

	public static void main(String[] args) {
		/* Construct a concrete house */
		HouseBuilder concreteBuilder = new ConcreteHouseBuilder();
		HouseBuildDirector concreteDirector = new HouseBuildDirector(concreteBuilder);
		House concreteHouse = concreteDirector.constructHouse();
		System.out.println(concreteHouse);

		/* Construct a wooden house */
		HouseBuilder woodenBuilder = new WoodenHouseBuilder();
		HouseBuildDirector woodendirector = new HouseBuildDirector(woodenBuilder);
		House woodenHouse = woodendirector.constructHouse();
		System.out.println(woodenHouse);
	}
}
