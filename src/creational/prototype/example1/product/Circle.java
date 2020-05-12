package creational.prototype.example1.product;

public class Circle extends Shape {
	
	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("This is from draw method of Circle");
	}

}
