package _001_lamda_exp;

public class LamdaMain2 {
	public static void main(String[] args) {
		MathOperations mathOperations = (a, b) -> System.out.println("Sum:" + (a + b));
		mathOperations.operation(2, 3);
		MathOperations mathOperations1 = (a, b) -> System.out.println("Subtract:" + (a - b));
		mathOperations1.operation(2, 3);
	}

	@FunctionalInterface
	interface MathOperations {
		void operation(int a, int b);
	}
}
