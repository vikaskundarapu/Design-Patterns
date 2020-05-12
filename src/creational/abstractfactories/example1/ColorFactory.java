package creational.abstractfactories.example1;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {

		if (null == color)
			return null;

		if (color.equalsIgnoreCase("Red"))
			return new Red();
		else if (color.equalsIgnoreCase("Blue"))
			return new Blue();
		else if (color.equalsIgnoreCase("Green"))
			return new Green();

		return null;
	}

}
