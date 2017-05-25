package _001_lamda_exp.start;

import java.util.function.Predicate;

public class _002PredicateMain {
	public static void main(String[] args) {
		// We are passing a value to consumer and mention its behabiour
		print((a) -> a.startsWith("H"), "Hello");
		print((a) -> a.startsWith("h"), "Hello");
		print((a) -> a.length() >= 5, "Hello");
	}

	// Consumer consume value & return nothing
	public static void print(Predicate<String> predicate, String str) {
		if (predicate.test(str)) {
			System.out.println(str);
		}
	}
}
