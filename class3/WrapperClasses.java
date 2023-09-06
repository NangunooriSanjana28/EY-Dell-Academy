package class3;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		//data types
		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';
		
		//AutoBoxing- To get a object out of a data Type - Wrapper Class
		Byte bObject = new Byte(grade);
		Short sObject = new Short(marks);
		System.out.println("Data Type grade is "+grade);
		System.out.println("Object bobject is "+bObject);
		
		byte byteValue = bObject.byteValue();//Unboxing
		System.out.println(byteValue);

	}

}
