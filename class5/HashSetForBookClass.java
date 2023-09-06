package class5;


import java.util.Iterator;
import java.util.TreeSet;

public class HashSetForBookClass {

	public static void main(String[] args) {
		TreeSet<Book> hset = new TreeSet<>();
		
		Book b1 = new Book(1,"A","B","C",10);
		Book b2 = new Book(12,"P","Q","R",100);
		Book b3 = new Book(32,"M","N","o",1800);
		
		hset.add(b1);hset.add(b1);hset.add(b1);
		hset.add(b3);hset.add(b2);hset.add(b2);
		
		for(Book b:hset) {
			System.out.println(b.bookId+" "+b.name + " " +b.publisher + " "+b.author +" "+b.quantity);
		}
		Iterator<Book> itr = hset.iterator();
		while(itr.hasNext()) {
			
		    Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " +b.quantity);
		
		}
		
		
	}

}
