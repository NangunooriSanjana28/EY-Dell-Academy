package class5;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {

	public static void main(String[] args) {
		
		
		//Insertion Order = maintained
		//Duplicates are allowed
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("A");arrList.add("A");arrList.add("A");arrList.add("A");
		
		//any number of null is allowed
		arrList.add(null);arrList.add(null);arrList.add(null);
		
		arrList.add("Z");arrList.add("X");arrList.add("Y");arrList.add("B");
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("P");arrList2.add("P");arrList2.add("Q");
		//Adding second arrayList in first arrayList
		arrList.addAll(arrList2);
		//size of the arrayList
		System.out.println("Size of my array list is "+arrList.size());
		
		//removing first A
		arrList.remove("A");
		
		//removing second arrayList from first ArrayList
		arrList.removeAll(arrList2);
		//Updating the element at first index in the arrayList
		arrList.set(1,"New Second Element");
		
		//removing all elements from first arrayList and keeping
		//all elements of second array list
		arrList.retainAll(arrList2);
		
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		//In the end ,you clear your entire arrayList like this
		arrList.clear();
		
		// You can print your arrayList like this also
		for(String str:arrList) {
			System.out.println(str + " ");
		}
		

	}

}
