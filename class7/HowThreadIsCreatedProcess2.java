package class7;

public class HowThreadIsCreatedProcess2 implements Runnable {

	public static void main(String[] args) {
		
		HowThreadIsCreatedProcess2 obj = new HowThreadIsCreatedProcess2();
		Thread t1 = new Thread(obj);
		t1.start();

	}
	public void run() {
		System.out.println("I also got called automatically");
	}

}
