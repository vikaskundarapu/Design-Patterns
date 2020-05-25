package behavioral.visitor.example2.visitable;

import behavioral.visitor.example2.visitor.AnimalVisitor;

public class Dolphin implements AnimalVisitable {

	@Override
	public void accept(AnimalVisitor visitor) {
		visitor.visitDolphin(this);
	}

	public void makeSound() {
		System.out.println("Tuut tuttu tuutt!!");
	}
}
