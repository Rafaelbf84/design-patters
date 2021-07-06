package behavioral.iterator.impl;

public class Main {

	public static void main(String[] args) {
		// Build a collection
		Collection collection = new Collection();
		collection.add(new Item("Item 0"));
		collection.add(new Item("Item 1"));
		collection.add(new Item("Item 2"));
		collection.add(new Item("Item 3"));
		collection.add(new Item("Item 4"));
		collection.add(new Item("Item 5"));
		collection.add(new Item("Item 6"));
		collection.add(new Item("Item 7"));
		collection.add(new Item("Item 8"));

		// Create iterator
		Iterator iterator = collection.CreateIterator();

		// Skip every other item
		iterator.setStep(1);

		System.out.println("Iterating over collection:");

		for (Item item = iterator.first(); !iterator.isDone(); item = iterator.next()) {
			System.out.println(item.getName());
		}
	}

}
