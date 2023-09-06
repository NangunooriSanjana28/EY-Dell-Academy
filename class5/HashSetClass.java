package class5;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetClass {

	public static void main(String[] args) {
		
		TreeSet<String> hSet = new TreeSet<>();//hash set has no duplicates and random order it prints
		hSet.add("Z");hSet.add("Z");hSet.add("Z");hSet.add("Z");
		
		//hSet.add(null);hSet.add(null);hSet.add(null);
		
		hSet.add("X");hSet.add("A");hSet.add("Y");hSet.add("B");
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
