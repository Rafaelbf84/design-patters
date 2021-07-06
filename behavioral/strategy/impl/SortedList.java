package behavioral.strategy.impl;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

	private List<String> list = new ArrayList<String>();

	private SortStrategy sortStrategy;

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void add(String name) {
		list.add(name);
	}

	public void sort() {
		sortStrategy.sort(list);

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println();
	}

}
