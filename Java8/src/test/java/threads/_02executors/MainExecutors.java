package _02executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutors {
	public static void main(String[] args) {
		// Inner Class For Creating Threads
		class MyThread implements Runnable {
			int threadNo = 0;

			public MyThread(int threadNo) {
				this.threadNo = threadNo;
			}

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + threadNo + ":" + i);
				}
			}

		}
		// Normal Code to execute task using Executor
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			MyThread myThread = new MyThread(i);
			executorService.submit(myThread);
		}
		executorService.shutdown();
	}

}
