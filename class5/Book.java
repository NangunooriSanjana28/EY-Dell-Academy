package class5;

public class Book {
	int bookId;
	String author,publisher,name;
	int quantity;
	
	//constructor
	Book(int bookId,String author,String publisher,String name,int quantity) {
		this.bookId = bookId;
		this.author=author;
		this.publisher = publisher;
		this.name=name;
		this.quantity=quantity;
	}

}
