package class5;

import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> hMap = new TreeMap<>();
		hMap.put(123, "ABC");
		//hMap.put(123, null);//second record with same key will override first record
		//hMap.put(121, null);
		//hMap.put(null, "PQR");
		//hMap.put(null, "XYZ");
		//hMap.put(null, "MNO");
		
		hMap.remove(123);
		
		//This is how we traverse Map
		for(Map.Entry<Integer, String> m:hMap.entrySet()) {
			System.out.println(m.getKey() +" : "+ m.getValue());
		}

	}

}
