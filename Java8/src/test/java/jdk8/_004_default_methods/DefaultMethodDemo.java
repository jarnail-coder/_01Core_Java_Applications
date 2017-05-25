package _004_default_methods;

public class DefaultMethodDemo {
	public static void main(String[] args) {
		new Test().show();
	}

}

class Test implements DefaultInterface1, DefaultInterface2 {
	@Override
	public void show() {
		DefaultInterface1.super.show();
		DefaultInterface2.super.show();
		System.out.println("THis is Impelmentation");
	}
}

interface DefaultInterface1 {
	default void show() {
		System.out.println("THis is first Impelmentation");
	}
}

interface DefaultInterface2 {
	default void show() {
		System.out.println("THis is Second Impelmentation");
	}
}
