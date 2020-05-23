package behavioral.iterator.example1.collection;

import java.util.Arrays;

import behavioral.iterator.example1.iterator.ArrayIntegerIterator;
import behavioral.iterator.example1.iterator.IntegerIterator;

public class ArrayIntegerCollection implements IntegerCollection {

	private int[] collectionOfIntergers;
	private int size;

	public ArrayIntegerCollection(int capacity) {
		collectionOfIntergers = new int[capacity];
		size = 0;
	}

	@Override
	public IntegerIterator getIterator() {
		return new ArrayIntegerIterator(Arrays.copyOf(collectionOfIntergers, size), size);
	}

	@Override
	public void add(int integer) {
		collectionOfIntergers[size++] = integer;
	}

}
