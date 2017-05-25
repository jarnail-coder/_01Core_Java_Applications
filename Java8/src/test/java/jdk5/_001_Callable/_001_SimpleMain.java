package _001_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class _001_SimpleMain {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<String> callable = new CallableDemo();
		// Thread will start automatically after submittion
		Future<String> future = executor.submit(callable);
		System.out.println("Thread Submitted");
		try {
			Thread.sleep(3000);
			System.out.println("Waiting For Response");
			executor.shutdown();
			System.out.println("Response:" + future.get());
			// you can get response multiple time but thread will execute only
			// once
			System.out.println("Response:" + future.get());
			// System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		try {
			Thread.sleep(3000);
			System.out.println("Waiting For Response");
			System.out.println("Response:" + future.get());
			// you can get response multiple time but thread will execute only
			// once
			System.out.println("Response:" + future.get());
			// System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CallableDemo implements Callable<String> {
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("I :" + i);
		}
		return Thread.currentThread().getName();
	}
}