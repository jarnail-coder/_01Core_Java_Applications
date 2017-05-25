package _01simple_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01FailFast {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>() {
			{
				add("a");
				add("b");
				add("c");
			}
		};
		Iterator<String> iterator = lst.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			if (string.equals("b")) {
				lst.add("d");
			}
		}
	}
}
