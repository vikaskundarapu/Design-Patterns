package behavioral.visitor.example1.client;

import java.util.ArrayList;
import java.util.List;

import behavioral.visitor.example1.visitable.FoodItem;
import behavioral.visitor.example1.visitable.LiquorItem;
import behavioral.visitor.example1.visitable.Visitable;
import behavioral.visitor.example1.visitor.DiscountVisitor;
import behavioral.visitor.example1.visitor.TaxVisitor;

/**
 * When to use: To perform similar operations on objects of different types
 * grouped in a structure (a collection or a more complex structure). To perform
 * distinct and unrelated operations on objects without polluting their classes
 * with these operations. To run different methods based on concrete type
 * without instanceof or typeof operators. To perform double dispatching.
 * 
 * 
 * Intent: Represent an operation to be performed on the elements of an object
 * structure. Visitor lets you define a new operation without changing the
 * classes of the elements on which it operates.
 * 
 * Components: A Visitable Interface, Concrete classes that implement Visitable
 * interface, a Visitor Interface, Concrete classes that implement Visitor
 * interface Structure
 * 
 * Implementation: Consider a scenario where we need to perform a certain kind
 * of operation without modifying the actual classes. For example, while
 * creating an order, we want to perform a set of operations on all items (for
 * e.g. applying a discount, calculate tax, etc). We can add getTax() and
 * getDiscount() methods to the actual classes, but this pollutes the class and
 * requires a change in the class signature every time an operation needs to be
 * added or removed. We can avoid these issues by using the double delegation
 * feature of the Visitor pattern.
 * 
 */

public class VisitorOrderProcessingClient {

	public static void main(String[] args) {
		/* Create order and add items */
		List<Visitable> order = new ArrayList<>();
		order.add(new FoodItem(1, "Italian Pizza", 6.99));
		order.add(new LiquorItem(1, "Wine", 9.99));
		order.add(new LiquorItem(1, "Beer", 5.99));
		order.add(new FoodItem(1, "Red Apple", 1.49));
		order.add(new FoodItem(1, "Almonds", 11.99));

		/* Create visitors to be applied */
		DiscountVisitor discountVisitor = new DiscountVisitor();
		TaxVisitor taxVisitor = new TaxVisitor();

		/* Apply visitors on items */
		order.stream().forEach((Visitable visitable) -> {
			visitable.apply(discountVisitor);
			visitable.apply(taxVisitor);
		});

		System.out.println("Total Discount = " + discountVisitor.getTotalDiscount());
		System.out.println("Total Tax = " + taxVisitor.getTotalTax());
	}

}
