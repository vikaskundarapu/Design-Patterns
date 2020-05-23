package behavioral.iterator.example2.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import behavioral.iterator.example2.Egg;
import behavioral.iterator.example2.iterator.EggIterator;

public class EggBasket implements Iterable<Egg> {

	private List<Egg> eggs;

	public EggBasket() {
		eggs = new LinkedList<>();
	}

	public void add(Egg egg) {
		eggs.add(egg);
	}

	@Override
	public Iterator<Egg> iterator() {
		return new EggIterator(new LinkedList<>(eggs));
	}

}
