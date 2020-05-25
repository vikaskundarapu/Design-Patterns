package behavioral.visitor.example2.visitor;

import behavioral.visitor.example2.visitable.Dolphin;
import behavioral.visitor.example2.visitable.Lion;
import behavioral.visitor.example2.visitable.Monkey;

public interface AnimalVisitor {

	public void visitMonkey(Monkey monkey);

	public void visitLion(Lion lion);

	public void visitDolphin(Dolphin dolphin);

}
