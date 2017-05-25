package _001_Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class _002_Main {
	public static void main(String[] args) {
		// To execute only single thread at a time
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// To execute Only two threads at a time
		// ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(new A());
		executorService.submit(new A());
		executorService.submit(new A());
//		executorService.submit(()->{for(int i=)});
		System.out.println("Submitted All Three");
		executorService.shutdown();
	}
}

class A implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}