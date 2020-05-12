package creational.prototype.example1.product;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("This is from draw method of Square");
	}

}
