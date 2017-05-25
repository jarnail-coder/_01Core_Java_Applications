package _001_lamda_exp.start;

public class _001SimpleMain {
	public static void main(String[] args) {
		// Two implemention of Operate class
		Operation sum = (a, b) -> a + b;
		Operation subtract = (a, b) -> a - b;
		StringLength stringLength = a -> a.length();
		System.out.println(sum.doIt(2, 3));
		System.out.println(subtract.doIt(2, 3));
		System.out.println(stringLength.doIt("Hello"));
		System.out.println("++++++++++++++++++++");
		doOperation(sum, 2, 3);
		doOperation(subtract, 3, 2);
		doOperation((a, b) -> a * b, 3, 2);

		System.out.println("++++++++++++++++++++");
		StringLength strLamda = (a) -> a.length();
		doStringOp(stringLength, "Hello");
	}

	public static void doOperation(Operation operation, int a, int b) {
		System.out.println(operation.doIt(a, b));
	}

	public static void doStringOp(StringLength stringLength, String str) {
		System.out.println(stringLength.doIt(str));
	}
}

interface Operation {
	int doIt(int a, int b);
}

interface StringLength {
	int doIt(String str);
}
