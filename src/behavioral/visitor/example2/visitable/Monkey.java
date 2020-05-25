package behavioral.visitor.example2.visitable;

import behavioral.visitor.example2.visitor.AnimalVisitor;

public class Monkey implements AnimalVisitable {

	@Override
	public void accept(AnimalVisitor visitor) {
		visitor.visitMonkey(this);
	}

	public void makeSound() {
		System.out.println("Ooh oo aa aa!");
	}

}
