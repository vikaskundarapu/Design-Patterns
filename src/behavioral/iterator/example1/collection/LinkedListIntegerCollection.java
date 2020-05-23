package behavioral.iterator.example1.collection;

import java.util.LinkedList;
import java.util.List;

import behavioral.iterator.example1.iterator.IntegerIterator;
import behavioral.iterator.example1.iterator.LinkedListIntegerIterator;

public class LinkedListIntegerCollection implements IntegerCollection {

	private List<Integer> collectionOfIntegers;

	public LinkedListIntegerCollection() {
		collectionOfIntegers = new LinkedList<>();
	}

	@Override
	public IntegerIterator getIterator() {
		return new LinkedListIntegerIterator(new LinkedList<>(collectionOfIntegers));
	}

	@Override
	public void add(int integer) {
		collectionOfIntegers.add(integer);
	}

}
