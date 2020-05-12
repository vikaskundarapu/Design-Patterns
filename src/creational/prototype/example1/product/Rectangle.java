package creational.prototype.example1.product;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("This is from draw method of Rectangle");
	}

}
