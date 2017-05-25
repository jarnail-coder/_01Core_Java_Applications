package _001_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class _001Simplest {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(new TestThread());
		// Wait for the thread to complete
		executor.shutdown();
		// Shutdonw Immidiatly
		// executor.shutdownNow();
		System.out.println("future.isDone():" + future.isDone());
		//Wait for 2 seconds to get result
		Integer integer = future.get(2,TimeUnit.SECONDS);
		System.out.println("future.isDone():" + future.isDone());
		System.out.println(integer);
	}
}

class TestThread implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(2000);
			System.out.println("Thread Executing");
		} catch (Exception e) {
			System.out.println(e);
		}
		return 5;
	}
}