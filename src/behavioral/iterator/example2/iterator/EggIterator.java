package behavioral.iterator.example2.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import behavioral.iterator.example2.Egg;

public class EggIterator implements Iterator<Egg> {

	private List<Egg> eggs;

	public EggIterator(List<Egg> eggs) {
		this.eggs = eggs;
	}

	@Override
	public boolean hasNext() {
		return !eggs.isEmpty();
	}

	@Override
	public Egg next() {
		if (!hasNext())
			throw new NoSuchElementException("List is empty!");
		return eggs.remove(0);
	}

}
