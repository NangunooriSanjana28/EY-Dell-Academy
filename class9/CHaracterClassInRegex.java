package class9;

import java.util.regex.Pattern;

//[abc]-a or b or c
public class CHaracterClassInRegex {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "a"));//true
		System.out.println(Pattern.matches("[amn]", "aa"));//false
		System.out.println(Pattern.matches("[amn]", "m"));//true
		System.out.println(Pattern.matches("[amn]", "mn"));//false
		//any character except a or m or n
		System.out.println(Pattern.matches("[^amn]", "z"));//true
		//any alphabet lower case or upper case
		System.out.println(Pattern.matches("[a-zA-Z]", "B"));//true
		//a through d or m through p
		System.out.println(Pattern.matches("[a-d[m-p]]","e"));//false
	}

}
