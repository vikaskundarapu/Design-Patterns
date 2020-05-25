package behavioral.visitor.example2.visitor;

import behavioral.visitor.example2.visitable.Dolphin;
import behavioral.visitor.example2.visitable.Lion;
import behavioral.visitor.example2.visitable.Monkey;

public class Jump implements AnimalVisitor {

	@Override
	public void visitMonkey(Monkey monkey) {
		System.out.println("Jumped 20 feet high! on to the tree!");
	}

	@Override
	public void visitLion(Lion lion) {
		System.out.println("Jumped 7 feet! Back on the ground!");
	}

	@Override
	public void visitDolphin(Dolphin dolphin) {
		System.out.println("Walked on water a little and disappeared");
	}

}
