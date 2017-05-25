package _01simple_collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _02FailSafe {
	public static void main(String[] args) {
		List<String> lst = new CopyOnWriteArrayList<String>() {
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
