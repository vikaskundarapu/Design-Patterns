package structural.bridge.example1.shapes;

import structural.bridge.example1.colors.Color;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Draw a rectangle in ");
		color.applyColor();
	}

}
