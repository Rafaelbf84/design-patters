package behavioral.strategy.impl;

import java.util.Collections;
import java.util.List;

public class QuickSort implements SortStrategy {

	@Override
	public void sort(List<String> list) {
		Collections.sort(list);
		System.out.println("QuickSorted list!");
	}

}
