package _007_optional;

import java.util.Optional;

public class OptionalMain {
	public static void main(String[] args) {
		System.out.println(sum(Optional.ofNullable(2), Optional.ofNullable(null)));
	}

	public static int sum(Optional<Integer> a, Optional<Integer> b) {
		Integer val1 = null;
		Integer val2 = null;
		val1 = a.orElse(new Integer(0));
		val2 = b.orElse(new Integer(0));
		// val1 = a.get();
		// val2 = b.get();//java.util.NoSuchElementException: No value present

		return val1 + val2;
	}
}
