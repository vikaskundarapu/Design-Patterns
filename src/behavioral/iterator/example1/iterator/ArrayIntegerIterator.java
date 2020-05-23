package behavioral.iterator.example1.iterator;

public class ArrayIntegerIterator implements IntegerIterator {

	private int[] collectionOfIntergers;
	private int size;
	private int position;

	public ArrayIntegerIterator(int[] collectionOfIntergers, int size) {
		this.collectionOfIntergers = collectionOfIntergers;
		this.size = size;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		return position < size;
	}

	@Override
	public Integer next() {
		return collectionOfIntergers[position++];
	}

}
