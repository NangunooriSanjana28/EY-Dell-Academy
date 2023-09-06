package class7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDefinition {

	public static void main(String[] args) {
		
		int[] intArr = new int[6];
		intArr[0] = 10;
		intArr[1] = 20;
		
		ArrayList<Integer> arrList = new ArrayList(Arrays.asList(intArr));
		Iterator<Integer> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		//traverse using basic for loop
		for(int i=1;i<intArr.length;i++) {
			System.out.println(intArr[i] +" ");
		}
		System.out.println();
		int[] intArr2 = {30,40};
		
		//traverse using advanced for loop
		for(int data:intArr2) {
			System.out.println(data +" ");
		}
		
		//boolean[] blnArr = new boolean[4];
		

	}

}
