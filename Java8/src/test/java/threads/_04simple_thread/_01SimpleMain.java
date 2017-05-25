package _04simple_thread;

public class _01SimpleMain {
	public static void main(String[] args) {
		Thread thread = new Thread(new A());
		thread.start();
		thread.interrupt();
	}
}

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced:" + i);
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
