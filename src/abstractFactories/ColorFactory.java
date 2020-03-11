package abstractFactories;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub

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
