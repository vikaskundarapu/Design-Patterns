package behavioral.strategy.example2;

import behavioral.strategy.example2.sortstrategy.SortStrategy;

public class Sorter {

	private SortStrategy strategy;

	public Sorter(SortStrategy sorter) {
		super();
		this.strategy = sorter;
	}

	public void sort(int[] integers) {
		strategy.sort(integers);
	}
}
