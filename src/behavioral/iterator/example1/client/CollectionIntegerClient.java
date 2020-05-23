package behavioral.iterator.example1.client;

import behavioral.iterator.example1.collection.ArrayIntegerCollection;
import behavioral.iterator.example1.collection.IntegerCollection;
import behavioral.iterator.example1.collection.LinkedListIntegerCollection;
import behavioral.iterator.example1.iterator.IntegerIterator;

/**
 * Used to provide a standard way to traverse through collections of similar
 * objects. To expose a simple interface to the client by hiding the
 * complexities of the traversal. To provide a uniform interface for traversing
 * different aggregate structures. Intention is to provide a way to access the
 * elements of an aggregate object sequentially without exposing its underlying
 * representation.
 * 
 * Components: An interface for the collection Concrete implementations of the
 * collection interface. An "iterator" class that can encapsulate traversal of
 * the "collection" class. Structure
 * 
 * Implementation: The key idea is to take the responsibility for access and
 * traversal out of the aggregate object and put it into an Iterator object that
 * defines a standard traversal protocol. Lets create an iterator for a
 * collection of integers. The collection can be in the form of an array or a
 * linked list.
 */
public class CollectionIntegerClient {

	public static void main(String[] args) {
		IntegerCollection arrayIntegerCollection = new ArrayIntegerCollection(5);
		arrayIntegerCollection.add(1);
		arrayIntegerCollection.add(2);
		arrayIntegerCollection.add(3);
		arrayIntegerCollection.add(4);
		arrayIntegerCollection.add(5);

		IntegerIterator arrayIterator = arrayIntegerCollection.getIterator();
		System.out.print("Integers stored in array     : ");
		while (arrayIterator.hasNext()) {
			System.out.print(arrayIterator.next() + " ");
		}
		System.out.println("");

		IntegerCollection linkedListIntegerCollection = new LinkedListIntegerCollection();
		linkedListIntegerCollection.add(6);
		linkedListIntegerCollection.add(7);
		linkedListIntegerCollection.add(8);
		linkedListIntegerCollection.add(9);
		linkedListIntegerCollection.add(10);

		IntegerIterator linkedListIterator = linkedListIntegerCollection.getIterator();
		System.out.print("Integers stored in LinkedList: ");
		while (linkedListIterator.hasNext()) {
			System.out.print(linkedListIterator.next() + " ");
		}
	}

}
