package behavioral.iterator.impl;

import java.util.ArrayList;

public class Collection implements AbstractCollection {

	private ArrayList<Item> items = new ArrayList<Item>();
	
	@Override
	public Iterator CreateIterator() {
		return new Iterator(this);
	}

	public int count() {
		return items.size();
	}
	
	public Item get(int index) {
		return items.get(index);
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
}
