package structural.bridge.example1.shapes;

import structural.bridge.example1.colors.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Draw a circle in ");
		color.applyColor();
	}

}
