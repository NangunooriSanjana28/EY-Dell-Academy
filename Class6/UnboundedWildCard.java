package Class6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//accepts any collectionss
public class UnboundedWildCard {

	public static void main(String[] args) {
		
		UnboundedWildCard obj = new UnboundedWildCard();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(456);
		obj.printCollectionData(listInt);

	}
	void printCollectionData(Collection<?> objToPrint) {
		System.out.println("{");
		for(Object obj:objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() +":"+obj);
		}
		System.out.println("}");
		System.out.println();
	}

}
