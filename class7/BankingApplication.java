package class7;

class Customer{
	int amount = 10000;
	
	public synchronized void withdraw(int amount) {
		System.out.println("User has come to withdraw amount " + amount);
		
		if(this.amount < amount) {
			System.out.println("Less Balance,waiting to depoist...");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw Completed");
	}
	public synchronized void depoist(int amount) {
		System.out.println("User has come to depoist");
		this.amount += amount;
		System.out.println("Depoist completed for amount "+amount);
		notify();
	}
}

public class BankingApplication {
	public static void main(String[] args) {
		final Customer c1 = new Customer();
		new Thread() {
			public void run() {
				c1.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c1.depoist(10000);
			}
		}.start();
	}

}
