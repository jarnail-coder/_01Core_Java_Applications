package _02executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutors2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Inner Class For Creating Threads
		class SumInteger implements Callable<Integer> {
			int maxValue = 0;

			public SumInteger(int maxValue) {
				this.maxValue = maxValue;
			}

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i = 0; i < maxValue; i++) {
					sum += i;
				}
				return sum;
			}

		}
		class SquareInteger implements Callable<Double> {
			double value = 0;

			public SquareInteger(double value) {
				this.value = value;
			}

			@Override
			public Double call() throws Exception {
				// TODO Auto-generated method stub
				return value * value;
			}

		}
		// Normal Code to execute task using Executor
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> futureSum = executorService.submit(new SumInteger(4));
		Future<Double> futureSquare = executorService.submit(new SquareInteger(2.2f));
		System.out.println("Sum:" + futureSum.get());
		System.out.println("Square:" + futureSquare.get());
		executorService.shutdown();
	}

}
