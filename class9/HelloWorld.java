package class9;

//Time Complexity is
//Instead of measuring actual time required in executing each statement
//Time Complexity consider how many time each statement executed

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");//Once O(1)
        display();		

	}
	static void display() {
		int n =9;
		for(int i=0;i<n;i++) {
			System.out.println("Hello World !!!\n");//O(n)
		}
		for (int i=1;i<n;i=i*2) {
			System.out.println("Hello world !!!\n"); //O(log2(n))
		}
		for(int i=2;i<n;i=(int)Math.pow(i, 2)) {
			System.out.println("Hellow World !!!\n");//O(log(log((n))
		}
	}

}
