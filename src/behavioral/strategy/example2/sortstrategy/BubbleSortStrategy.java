package behavioral.strategy.example2.sortstrategy;

import java.util.Arrays;

public class BubbleSortStrategy implements SortStrategy {

	@Override
	public void sort(int[] integers) {
		System.out.println("Sorting using Bubble sort");
		bubbleSort(integers);
		System.out.println("Sorted Array: " + Arrays.toString(integers));
	}

	private void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
