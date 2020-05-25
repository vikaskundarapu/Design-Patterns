package behavioral.visitor.example1.visitor;

import behavioral.visitor.example1.visitable.FoodItem;
import behavioral.visitor.example1.visitable.LiquorItem;

public class TaxVisitor implements Visitor {

	private double totalTax = 0;

	@Override
	public void visit(FoodItem foodItem) {
		/* apply 2% tax on food items */
		double actualPrice = foodItem.getPrice();
		double tax = actualPrice * 0.02;
		totalTax += tax;
		foodItem.setPrice(actualPrice + tax);
	}

	@Override
	public void visit(LiquorItem liquorItem) {
		/* apply 20% tax on food items */
		double actualPrice = liquorItem.getPrice();
		double tax = actualPrice * 0.2;
		totalTax += tax;
		liquorItem.setPrice(actualPrice + tax);
	}

	public double getTotalTax() {
		return totalTax;
	}

}
