package Class6;

import java.util.HashMap;

//a,e,i,o,u
public class PrintNextVowelInAString {

	public static void main(String[] args) {
		
		String str = "amithakur";
		System.out.println("NextVowel String is " +printNextVowel(str.toCharArray()));

	}
	public static String printNextVowel (char[] str) {
		
		HashMap<Character,Integer> hMap = new HashMap<>();
		hMap.put('a', 0);
		hMap.put('e', 1);
		hMap.put('i', 2);
		hMap.put('o', 3);
		hMap.put('u', 4);
		
		char[] arr = {'a','e','i','o','u'};
		
		int lengthOfString = str.length;
		
		//Iterate over entire String
		for(int i=0;i<lengthOfString;i++) {
			char c=str[i];
			System.out.println("Character is "+c);
			//If current character is vowel,find the index in hash and replace
			//with next vowel from hash itself
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				int index = hMap.get(c)+1;
				int newIndex = index%5;
				
				
				str[i] = arr[newIndex];
				
				System.out.println("index "+index);
				System.out.println("new index "+newIndex);
			}
		}
		return String.valueOf(str);
	}

}
