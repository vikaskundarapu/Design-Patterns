package behavioral.iterator.example1.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class LinkedListIntegerIterator implements IntegerIterator {
	private List<Integer> collectionOfIntegers;

	public LinkedListIntegerIterator(List<Integer> collectionOfIntegers) {
		this.collectionOfIntegers = collectionOfIntegers;
	}

	@Override
	public boolean hasNext() {
		return !collectionOfIntegers.isEmpty();
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException("List is empty!");
		}

		return collectionOfIntegers.remove(0);
	}

}
