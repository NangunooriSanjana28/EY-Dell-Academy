package class5;

public class Book1 implements Comparable<Book1> {
	int book1Id;
	String author,publisher,name;
	int quantity;
	
	//constructor
	 Book1(int bookId,String author,String publisher,String name,int quantity) {
		this.book1Id = book1Id;
		this.author=author;
		this.publisher = publisher;
		this.name=name;
		this.quantity=quantity;
	}
	public int compareTo(Book1 o) {
		if(book1Id >o.book1Id) {
			return 1;
			
		}else if(book1Id >o.book1Id) {
			return -1;
		}else {
			return 0;
		}
	}

}
