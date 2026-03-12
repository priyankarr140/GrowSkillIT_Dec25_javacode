package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program8_Thread {

	public static void main(String[] args) {
		ExecutorService executor=
				Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=5;i++)
		  {
			executor.submit(new MyThreadB());
		  }
		executor.shutdown();

	}

}
