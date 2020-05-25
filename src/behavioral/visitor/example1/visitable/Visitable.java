package behavioral.visitor.example1.visitable;

import behavioral.visitor.example1.visitor.Visitor;

public interface Visitable {

	public void apply(Visitor visitor);

}
