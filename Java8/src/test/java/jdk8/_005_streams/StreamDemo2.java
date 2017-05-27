package _005_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class StreamDemo2 {
	public static void main(String[] args) {
		Random random = new Random();
		// 50 no's min-0 max-100
		random.ints(50, 0, 100).limit(10).forEach(System.out::println);
		// Filter With Collector
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		long countNonEmpty = strings.stream().filter(str -> {
			return !str.isEmpty();
		}).count();
		System.out.println("Non Empty values:" + countNonEmpty);
		String stringValue = strings.stream().filter(str -> {
			return !str.isEmpty();
		}).collect(Collectors.joining(","));
		System.out.println(stringValue);
		//
		List<Integer> numbers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}
}
