package _001_lamda_exp;

public class LamdaMain1 {
	public static void main(String[] args) {
		InnerInterface innerInterface = (a, b) -> System.out.println("Sum:" + (a + b));
		innerInterface.sum(2, 3);
	}

	@FunctionalInterface
	interface InnerInterface {
		void sum(int a, int b);
	}

}
