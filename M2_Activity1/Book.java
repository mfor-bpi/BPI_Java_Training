package ph.com.bpi.m2.act1;

public class Book {
	
	String title = "Lord of the Rings";
	String author = "J.R.R. Tolkien";
	int yearpublished = 1954;
	
	void Title() {
		System.out.println("The title of the book is " + title);
	}
	
	void Author() {
		System.out.println("The author of the book is " + author);
	}
	
	void YearPublished() {
		System.out.println("The book was published on year " + yearpublished + "\n");
	}
	
}
