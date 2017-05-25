package _002_method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("aman", "varun", "Jarnail", "Samita", "Sonam");
		Predicate<String> predicate = n -> n.length() > 5 ? true : false;
		eval(list, predicate);
		System.out.println("================");
		eval(list, n -> n.length() > 5 ? true : false);

	}

	public static void eval(List<String> list, Predicate<String> predicate) {
		for (String n : list) {

			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}
}
