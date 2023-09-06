package class5;

import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapForCustomClasses {

	public static void main(String[] args) {
		
		TreeMap<Integer,Book1> hMap = new TreeMap<>();	
		
		Book1 b1 = new Book1(1,"A","B","C",10);
		Book1 b2 = new Book1(12,"P","Q","R",100);
		Book1 b3 = new Book1(32,"M","N","o",1800);
		
		hMap.put(123, b3);
		hMap.put(135, b2);
		hMap.put(121, b3);
		
		for(Entry<Integer, Book1> m:hMap.entrySet()) {
			int key = m.getKey();
			Book1 b = m.getValue();
			System.out.println("Key " + key + " details are ");
			System.out.println(b.book1Id + "  " + b.name + "  " + b.publisher + "  " + b.author + "  " +b.quantity);
			
		}

	}

}
