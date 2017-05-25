package _001simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleMain01 {
	public static void main(String[] args) {
		show(new ArrayList<Integer>() {
			{
				add(10);
				add(20);
				add(30);
			}
		});
		show(new ArrayList<Double>() {
			{
				add(10.23);
				add(20.234);
				add(30.34);
			}
		});

	}

	// Any Class that extends Number class
	public static void show(List<? extends Number> lst) {
		for (Number n : lst)
			System.out.println(n);
	}
}
