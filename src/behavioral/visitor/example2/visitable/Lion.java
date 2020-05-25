package behavioral.visitor.example2.visitable;

import behavioral.visitor.example2.visitor.AnimalVisitor;

public class Lion implements AnimalVisitable {

	@Override
	public void accept(AnimalVisitor visitor) {
		visitor.visitLion(this);
	}

	public void makeSound() {
		System.out.println("Roarrr!");
	}

}
