package creational.simplefactory.product;

public class WoodenDoor implements Door {

	private final float width;
	private final float length;

	public WoodenDoor() {
		width = 0.0f;
		length = 0.0f;
	}

	public WoodenDoor(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public float getWidth() {
		return width;
	}

	@Override
	public float getLength() {
		return length;
	}

}
