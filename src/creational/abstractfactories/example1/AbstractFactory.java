package creational.abstractfactories.example1;

public interface AbstractFactory {

	public Shape getShape(String shape);

	public Color getColor(String color);
}
