package behavioral.visitor.example1.visitor;

import behavioral.visitor.example1.visitable.FoodItem;
import behavioral.visitor.example1.visitable.LiquorItem;

public interface Visitor {

	void visit(FoodItem foodItem);

	void visit(LiquorItem liquorItem);
}
