package structural.decorator.impl;

public abstract class Decorator extends LibraryItem {

	protected LibraryItem libraryItem;

	public Decorator(LibraryItem libraryItem) {
		this.libraryItem = libraryItem;
	}

	@Override
	public void display() {
		libraryItem.display();
	}
	
}
