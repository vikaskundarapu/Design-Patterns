package behavioral.iterator.example1.collection;

import behavioral.iterator.example1.iterator.IntegerIterator;

public interface IntegerCollection {

	public IntegerIterator getIterator();

	public void add(int integer);
}
