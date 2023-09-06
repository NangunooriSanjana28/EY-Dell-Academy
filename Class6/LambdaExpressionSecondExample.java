package Class6;

@FunctionalInterface
interface isFunctional{
	void show(String data);
}

public class LambdaExpressionSecondExample {

	public static void main(String[] args) {
		isFunctional obj = new isFunctional() {
			@Override
			public void show(String data) {
				System.out.println("Using Anonymous Inner "+data);
			}
		};
		obj.show("Class way of implementation");
		
		isFunctional obj2 = (demodata) -> {
			System.out.println("Eliminating Anonymous Inner "+ demodata);
		};
		obj2.show("Using Class way of implementation - Lambda Expression");
		

	}

}
