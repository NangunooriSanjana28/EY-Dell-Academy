package class3;

public class AdderUtility {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		AdderUtility obj = new AdderUtility();
		System.out.println("Result si " +obj.add(10, 20));
		System.out.println("Result si "+obj.add(10,20,30));
		System.out.println("Result si "+obj.add(10.35, 20.22));
		}



}
