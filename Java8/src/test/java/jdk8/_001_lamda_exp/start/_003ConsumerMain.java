package _001_lamda_exp.start;

import java.util.function.Consumer;

public class _003ConsumerMain {
	public static void main(String[] args) {
		// We are passing a value to consumer and mention its behabiour
		print((a) -> System.out.println(a), "Hello");
	}

	// Consumer consume value & return nothing
	public static void print(Consumer<String> s, String str) {
		str = str.toUpperCase();
		s.accept(str);
	}
}
