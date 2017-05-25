package _001_lamda_exp.start;

import java.util.function.Function;

public class _006BiFuncationMain {
	public static void main(String[] args) {
		doOperation((s)->s.length(), "Helllo");
		doOperation((s)->s.split(" ").length, "Helllo Aman");
	}

	public static void doOperation(Function<String, Integer> function, String str) {
		int value=function.apply(str);
		System.out.println("Output::>"+value);
	}

}
