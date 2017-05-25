package _005_streams;

import java.util.Arrays;
import java.util.List;

public class _001SimpleMain {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Aman", "varun", "Sonu");
		lst.forEach(p -> System.out.println(p));
		System.out.println("As same Arguments");
		lst.forEach(System.out::println);
	}
}
