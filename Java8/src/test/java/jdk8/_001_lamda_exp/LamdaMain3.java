package _001_lamda_exp;

public class LamdaMain3 {
	public static void main(String[] args) {
		MathOperations mathOperationsSum = (a, b) -> System.out.println("Sum:" + (a + b));
		MathOperations mathOperationsSubtract = (a, b) -> System.out.println("Subtract:" + (a - b));
		Results results = (a, b, mathOperations) -> {
			mathOperations.operation(a, b);
		};
		results.doOperation(4, 5, mathOperationsSum);
		results.doOperation(4, 5, mathOperationsSubtract);
	}

	@FunctionalInterface
	interface MathOperations {
		void operation(int a, int b);
	}

	@FunctionalInterface
	interface Results {
		void doOperation(int a, int b, MathOperations mathOperations);
	}

}
