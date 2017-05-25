package _003_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> s = (String name) -> System.out.println("Your Name:" + name);
		s.accept("Aman");
		s.accept("Aman1");
	}
}

// class DemoConsumer implements Consumer<String> {
//
// @Override
// public void accept(String t) {
// System.out.println("Your Name is :" + t);
// }
//
// }