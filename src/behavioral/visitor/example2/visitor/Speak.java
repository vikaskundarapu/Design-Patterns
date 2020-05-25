package behavioral.visitor.example2.visitor;

import behavioral.visitor.example2.visitable.Dolphin;
import behavioral.visitor.example2.visitable.Lion;
import behavioral.visitor.example2.visitable.Monkey;

public class Speak implements AnimalVisitor {

	@Override
	public void visitMonkey(Monkey monkey) {
		monkey.makeSound();
	}

	@Override
	public void visitLion(Lion lion) {
		lion.makeSound();
	}

	@Override
	public void visitDolphin(Dolphin dolphin) {
		dolphin.makeSound();
	}

}
