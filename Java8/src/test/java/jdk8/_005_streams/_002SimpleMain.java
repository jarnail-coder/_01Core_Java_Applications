package _005_streams;

import java.util.Arrays;
import java.util.List;

public class _002SimpleMain {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Aman", "varun", "Sonu");
		lst.stream()								//lst is Source
		.filter(p->p.contains("a"))					//Condition if any
		.forEach((p) -> System.out.println(p));		//Output
	}
}
