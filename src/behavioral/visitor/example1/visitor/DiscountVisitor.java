package behavioral.visitor.example1.visitor;

import behavioral.visitor.example1.visitable.FoodItem;
import behavioral.visitor.example1.visitable.LiquorItem;

public class DiscountVisitor implements Visitor {

	private double totalDiscount = 0;

	@Override
	public void visit(FoodItem foodItem) {
		/* apply 30% off for food items */
		double actualPrice = foodItem.getPrice();
		double discount = actualPrice * 0.3;
		totalDiscount += discount;
		foodItem.setPrice(actualPrice - discount);
	}

	@Override
	public void visit(LiquorItem liquorItem) {
		/* apply 10% off for liquor items */
		double actualPrice = liquorItem.getPrice();
		double discount = actualPrice * 0.1;
		totalDiscount += discount;
		liquorItem.setPrice(actualPrice - discount);
	}

	public double getTotalDiscount() {
		return totalDiscount;
	}

}
