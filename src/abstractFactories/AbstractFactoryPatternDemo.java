package abstractFactories;
/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 * Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 **/

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
		
		Shape shape = abstractFactory.getShape("Circle"); 
		shape.draw();
		Shape shape1 = abstractFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2 = abstractFactory.getShape("Square");
		shape2.draw();
		
		System.out.println("");
		
		abstractFactory  = FactoryProducer.getFactory("Color");
		
		Color color = abstractFactory.getColor("Red");
		color.fillColor();

		Color color1 = abstractFactory.getColor("Blue");
		color1.fillColor();

		Color color2 = abstractFactory.getColor("Green");
		color2.fillColor();
	}

}
