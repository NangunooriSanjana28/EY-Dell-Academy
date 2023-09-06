package class3;

import java.sql.SQLException;

class Parent {
	void show() throws SQLException {
		System.out.println("Parent Class Method");
	}
}

public class ExceptionHandlingRules extends Parent {
	@Override
	void show() {
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {

	}

}
