package class5;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetWithCustomClass {
	public static void main(String[] args) {
		TreeSet<Book1> treeset = new TreeSet<>();
		
		Book1 b1 = new Book1(1,"A","B","C",10);
		Book1 b2 = new Book1(12,"P","Q","R",100);
		Book1 b3 = new Book1(32,"M","N","o",1800);
		
		
		treeset.add(b3);treeset.add(b2);treeset.add(b1);
		
		Iterator<Book1> itr = treeset.iterator();
		while(itr.hasNext()) {
			
		    Book1 b = itr.next();
			System.out.println(b.book1Id + " " + b.name + " " + b.publisher + " " + b.author + " " +b.quantity);

	}

}
}
