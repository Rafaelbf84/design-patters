package behavioral.strategy.impl;

public class Main {

	public static void main(String[] args) {
		SortedList studentRecords = new SortedList();

		studentRecords.add("Samual");
		studentRecords.add("Jimmy");
		studentRecords.add("Sandra");
		studentRecords.add("Vivek");
		studentRecords.add("Anna");

		studentRecords.setSortStrategy(new QuickSort());
		studentRecords.sort();

		studentRecords.setSortStrategy(new ShellSort());
		studentRecords.sort();

		studentRecords.setSortStrategy(new MergeSort());
		studentRecords.sort();
	}

}
