package _005_streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

 class StreamDemo1 {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("aman", "", "sonu", "reetika");
		long count = lst.stream().sorted((String s1, String s2) -> {
			return s2.compareTo(s1);
		}).limit(3).filter(s -> !s.isEmpty()).count();
		System.out.println(count);
		Random random = new Random();
		random.ints().limit(2).forEach(System.out::println);

		List<String> lstWithoutEmptyRec = lst.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		for (String s : lstWithoutEmptyRec) {
			System.out.println(s);
		}

		String str = lst.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
		System.out.println(str);
		System.out.println("+++++++++++++++++++++++++++++++++");
		List<String> lstRecWithCon = lst.stream().map(s -> s + ":" + s.length()).collect(Collectors.toList());
		for (String s : lstRecWithCon) {
			System.out.println(s);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		lst.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}
}
