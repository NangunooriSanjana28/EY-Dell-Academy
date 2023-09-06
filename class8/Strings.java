package class8;

public class Strings {

	public static void main(String[] args) {
		
		String str = new String("sanjana");
		System.out.println("After first step " +str);
		System.out.println("After second step "+str.charAt(1));
		//System.out.println("After third step -- "+str.replace('a','v'));
		System.out.println("After fourth step--");
	
		String[] StringsplitArray = str.split("j");
		System.out.println("No. of Strings " + StringsplitArray.length);
		
		for(String str2 : StringsplitArray) {
			System.out.println(str2 + " ");
			
		System.out.println();
			
		String str3 = new String("Sanjana");
		System.out.println("After fifth step -- "+str3.toLowerCase());
		System.out.println("After sixth set--"+str3.substring(0, str3.length()-1));
		
		}
		
	
	
}	
}	
		
		
		

