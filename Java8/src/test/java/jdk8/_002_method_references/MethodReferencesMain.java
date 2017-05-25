package _002_method_references;

public class MethodReferencesMain {
	public static void main(String[] args) {
		// When a Lambda expression is invoking already defined method, you can
		// replace it with reference to that method.

		// Results results = () -> MethodRefOperations.show();
		Results results = MethodRefOperations::show;
		results.doOperation();
		results = MethodRefOperations::disp;
		results.doOperation();
		results = new MethodRefOperations()::display;
		results.doOperation();
	}

	interface Results {
		void doOperation();
	}
}

class MethodRefOperations {
	public static void show() {
		System.out.println("show() method is called");
	};

	public static void disp() {
		System.out.println("disp() method is called");
	};

	public void display() {
		System.out.println("display() method is called");
	}
}
