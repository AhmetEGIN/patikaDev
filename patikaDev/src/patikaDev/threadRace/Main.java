package patikaDev.threadRace;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sql.PooledConnection;

public class Main {

	public static void main(String[] args) {
		List<Integer> inputs = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			inputs.add(i);

		}
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		Finder finder = new Finder(inputs, odd, even);
		List<Thread> threads = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			
			executor.execute(finder);
		}
		executor.shutdown();
		finder.getSize();
		odd.stream().forEach(System.out::println);
		
		

	}

}
