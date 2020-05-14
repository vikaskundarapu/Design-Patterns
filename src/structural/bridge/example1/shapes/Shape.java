package structural.bridge.example1.shapes;

import structural.bridge.example1.colors.Color;

/**
 * Create the abstraction base class that "has a" color object and delegates the
 * color-oriented functionality to it.
 */

public abstract class Shape {

	protected Color color;

	protected Shape(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
