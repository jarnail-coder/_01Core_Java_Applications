package _007_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMain1 {
	public static void main(String[] args) {
		System.out.println(Optional.ofNullable("Aman").isPresent());
		System.out.println(Optional.ofNullable(null).isPresent());
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(strings);
		System.out.println(filtered);
	}
}
