package behavioral.strategy.example2.client;

import behavioral.strategy.example2.Sorter;
import behavioral.strategy.example2.sortstrategy.BubbleSortStrategy;
import behavioral.strategy.example2.sortstrategy.QuickSortStrategy;

/**
 * Real world example: Consider the example of sorting, we implemented bubble
 * sort but the data started to grow and bubble sort started getting very slow.
 * In order to tackle this we implemented Quick sort. But now although the quick
 * sort algorithm was doing better for large datasets, it was very slow for
 * smaller datasets. In order to handle this we implemented a strategy where for
 * small datasets, bubble sort will be used and for larger, quick sort.
 * 
 * In plain words: Strategy pattern allows you to switch the algorithm or
 * strategy based upon the situation.
 * 
 * Wikipedia says: In computer programming, the strategy pattern (also known as
 * the policy pattern) is a behavioural software design pattern that enables an
 * algorithm's behavior to be selected at runtime.
 * 
 * Programmatic example: Translating our example from above. First of all we
 * have our strategy interface and different strategy implementations
 * 
 * 
 */
public class SortStrategyClient {

	public static void main(String[] args) {
		int[] integers = new int[] { 5, 8, 1, 2, 4, 9, 3, 6 };

		Sorter bubbleSorter = new Sorter(new BubbleSortStrategy());
		bubbleSorter.sort(integers);
		
		Sorter quickSorter = new Sorter(new QuickSortStrategy());
		quickSorter.sort(integers);
	}

}
