package _001simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleMain02 {
	public static void main(String[] args) {
//		show(new ArrayList<Integer>() {
//			{
//				add(10);
//				add(20);
//				add(30);
//			}
//		});
		show(new ArrayList<Double>() {
			{
				add(10.23);
				add(20.234);
				add(30.34);
			}
		});

	}

	// Any Class that is parent of double class
	public static void show(List<? super Double> lst) {
		for (Object n : lst)
			System.out.println(n);
	}
}
