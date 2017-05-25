package _002_method_references;

public class Simple1 {
	public static void main(String[] args) {
		// no args->no param
		// ()->show()
		Thread t = new Thread(() -> show());
		t.start();

		// You can convert it to
		Thread t1 = new Thread(Simple1::show);
		t1.start();

	}

	public static void show() {
		System.out.println("Hello");
	}
}
