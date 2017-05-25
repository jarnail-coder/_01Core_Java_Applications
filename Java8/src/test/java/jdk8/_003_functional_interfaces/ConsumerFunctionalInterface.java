package _003_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
	static void show(String name) {
		System.out.println("Name:" + name);
	}

	public static void main(String[] args) {
		Consumer<String> consumer = ConsumerFunctionalInterface::show;
		consumer.accept("Aman");
		consumer.accept("Sonu");
		consumer.accept(null);
		consumer.accept("Raman");
	}

}
