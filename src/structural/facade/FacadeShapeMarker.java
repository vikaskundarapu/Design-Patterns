package structural.facade;

public class FacadeShapeMarker {

	Circle circle;
	Square square;
	Rectangle rectangle;

	public FacadeShapeMarker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}

	public void drawCircle(){
			circle.draw();
	}
	public void drawSquare(){
			square.draw();
	}
	public void drawRectangle(){
			rectangle.draw();
	}
}
