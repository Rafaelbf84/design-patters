package structural.decorator.impl;

public class Main {

	public static void main(String[] args) {
		// Create book
		Book book = new Book("Worley", "Inside ASP.NET", 10);
		book.display();

		// Create video
		Video video = new Video("Spielberg", "Jaws", 23, 92);
		video.display();

		// Make video borrowable, then borrow and display
		System.out.println("\nMaking video borrowable:");

		Borrowable borrowvideo = new Borrowable(video);
		borrowvideo.borrowItem("Customer #1");
		borrowvideo.borrowItem("Customer #2");

		borrowvideo.display();
	}

}
