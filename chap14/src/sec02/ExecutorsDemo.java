package sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

	public static void main(String[] args) {

		Runnable t = () -> {

			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};

		ExecutorService exr = Executors.newSingleThreadExecutor();
		exr.submit(t);

		System.out.println("End " + Thread.currentThread().getName());
		exr.shutdown();

	}
}
