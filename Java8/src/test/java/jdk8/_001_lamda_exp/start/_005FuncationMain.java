package _001_lamda_exp.start;

import java.util.function.BiFunction;

public class _005FuncationMain {
	public static void main(String[] args) {
		doOperation((s, s1) -> (s + s1).length(), "Helllo", "Aman");
	}

	public static void doOperation(BiFunction<String, String, Integer> function, String str, String str1) {
		int value = function.apply(str, str1);
		System.out.println("Output::>" + value);
	}

}
