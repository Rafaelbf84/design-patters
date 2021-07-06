package structural.decorator.impl;

public class Book extends LibraryItem {

	private String author;
	private String title;

	public Book(String author, String title, int numCopies) {
		this.numCopies = numCopies;
		this.author = author;
		this.title = title;
	}

	@Override
	public void display() {
		System.out.println("\nBook -----");
		System.out.println("    Author: " + author);
		System.out.println("    Title: " + title);
		System.out.println("    Copies: " + numCopies);
	}

}
