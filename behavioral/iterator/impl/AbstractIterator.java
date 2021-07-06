package behavioral.iterator.impl;

public interface AbstractIterator {

	Item first();

	Item next();

	boolean isDone();

	Item currentItem();
	
}
