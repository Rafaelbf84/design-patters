package behavioral.iterator.impl;

public class Iterator implements AbstractIterator {

	private Collection collection;
	private int current = 0;
	private int step = 1;

	public Iterator(Collection collection) {
		this.collection = collection;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	@Override
	public Item first() {
		current = 0;
		return collection.get(current);
	}

	@Override
	public Item next() {
		current += step;

		if (!isDone()) {
			return collection.get(current);
		} else {
			return null;
		}
	}

	@Override
	public boolean isDone() {
		return current >= collection.count();
	}

	@Override
	public Item currentItem() {
		return collection.get(current);
	}

}
