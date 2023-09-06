package class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {

	public static void main(String[] args) {
		
		int[] intArr = {10,2,82,93,103,1,3,3};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer arrays is " +Arrays.toString(intArr));
		
		String[] strArr= {"Z","A","X","B","W"};
		Arrays.sort(strArr);
		System.out.println("Sorted Integer arrays is " +Arrays.toString(strArr));
		
		List<String> ListStr = new ArrayList<>();
		ListStr.add("Z");ListStr.add("A");ListStr.add("Z");ListStr.add("Z");
		ListStr.add("X");ListStr.add("Y");
		Collections.sort(ListStr);
		for(String str:ListStr) {
			System.out.println(str +" ");
		}

	}

}
