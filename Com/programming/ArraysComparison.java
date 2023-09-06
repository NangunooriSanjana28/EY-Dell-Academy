package Com.programming;

import java.util.Arrays;

public class ArraysComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr1= {1,2};
		int[] intArr2= {1,3};
		
		boolean[] blnArr1= {true,false};
		boolean[] blnArr2= {true,false};
		
		if(intArr1 == intArr2) {
			System.out.println("== does work");
		}else {
			System.out.println("== doesnot work");
		}
		if(blnArr1 == blnArr2) {
			System.out.println("== does work");
		}else {
			System.out.println("== doesnot work");
			
		}
		boolean result = Arrays.equals(blnArr1, blnArr2);
		System.out.println("Result:"+result);
		
		System.out.println("Result is "+Arrays.equals(intArr1, intArr2));

	}

}
