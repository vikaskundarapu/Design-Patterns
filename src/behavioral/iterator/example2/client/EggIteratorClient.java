package behavioral.iterator.example2.client;

import java.util.Iterator;

import behavioral.iterator.example2.Egg;
import behavioral.iterator.example2.collection.EggBasket;

/**
 * Here we have an egg basket which contains eggs. Egg object is identified by a
 * number. We use Iterable and Iterator interfaces and provide implementation
 * for Iterator pattern.
 */
public class EggIteratorClient {

	public static void main(String[] args) {
		EggBasket eggBasket = new EggBasket();
		eggBasket.add(new Egg(1));
		eggBasket.add(new Egg(2));
		eggBasket.add(new Egg(3));

		/*
		 * We have used Iterable on egg basket. Hence, then can be used in a foreach
		 * loop
		 */
		for (Egg egg : eggBasket) {
			System.out.println(egg);
		}
	}

}
