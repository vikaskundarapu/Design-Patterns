package structural.bridge.example1.shapes;

import structural.bridge.example1.colors.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Draw a square in ");
		color.applyColor();
	}

}
