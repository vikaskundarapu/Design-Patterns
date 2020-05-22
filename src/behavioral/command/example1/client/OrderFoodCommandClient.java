package behavioral.command.example1.client;

import behavioral.command.example1.command.CancelDessert;
import behavioral.command.example1.command.CancelMainDish;
import behavioral.command.example1.command.Command;
import behavioral.command.example1.command.OrderDessert;
import behavioral.command.example1.command.OrderMainDish;
import behavioral.command.example1.invoker.Waiter;
import behavioral.command.example1.receiverobjects.Dish;
import behavioral.command.example1.receiverobjects.MainDish;

/**
 * 
 * Used when the executor of the command does not need to know anything at all
 * about what the command is, what context information it needs on or what it
 * does. To register a callback when some event is triggered. Intention is to
 * encapsulate a request as an object, thereby letting you parameterize clients
 * with different requests, queue or log requests, and support undoable
 * operations.
 * 
 * Consider a restaurant scenario. A customer doesn't give the order directly to
 * the cooks. A waiter takes the order to the kitchen where a designated cook
 * will execute the order based on the type of dish the customer ordered. In
 * this case, the waiter is just a medium who does not need to know anything
 * about what the customer has ordered and who is going to prepare.
 */
public class OrderFoodCommandClient {

	public static void main(String[] args) {
		/* Create a Waiter object */
		Waiter waiter = new Waiter();

		Dish mainDish = new MainDish("Pizza");
		Command orderMainDish = new OrderMainDish(mainDish);
		waiter.execute(orderMainDish);

		Dish dessert = new MainDish("Ice cream");
		Command orderDessert = new OrderDessert(dessert);
		waiter.execute(orderDessert);

		Command cancelMainDish = new CancelMainDish(mainDish);
		waiter.execute(cancelMainDish);

		Command cancelDessert = new CancelDessert(dessert);
		waiter.execute(cancelDessert);
	}

}
