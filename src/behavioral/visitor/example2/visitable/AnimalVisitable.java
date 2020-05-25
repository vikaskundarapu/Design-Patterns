package behavioral.visitor.example2.visitable;

import behavioral.visitor.example2.visitor.AnimalVisitor;

public interface AnimalVisitable {

	public void accept(AnimalVisitor visitor);

}
