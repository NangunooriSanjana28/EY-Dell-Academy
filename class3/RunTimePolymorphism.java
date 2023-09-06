package class3;

class Parent2{
	void show() {
		System.out.println("Parent Class Function");
	}
	int data = 10;
}
public class RunTimePolymorphism extends Parent2 {
	
	void show() {
		System.out.println("Child Class Function");
	}
	
	int data = 20;
	
	void display() {
		//this keyword refers to current class object
		//super keyword refers to immediate parent class object
		this.show();
		System.out.println("The value of data " +this.data);
		super.show();
		System.out.println("The value of data is " +super.data);
	}

	public static void main(String[] args) {
		Parent2 obj = new Parent2();
		obj.show();
		System.out.println("The Value od data is " +obj.data);
		
		RunTimePolymorphism obj2 = new RunTimePolymorphism();
		obj2.show();
		System.out.println("The value of data is "+obj2.data);
		
		Parent2 obj3 = new RunTimePolymorphism();
		obj3.show();
		System.out.println("the Value of data is " +obj.data);
		
		obj2.display();
		
		

	}

}
