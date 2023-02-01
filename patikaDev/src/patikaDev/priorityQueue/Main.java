package patikaDev.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		q.add("Zehra");
		q.add("Ahmet");
		q.add("Celal");
		
		q.add("Mustafa");
		q.add("Burcu");

		
		for (String string : q) {
			System.out.println(string);
		}
		System.out.println("*****");
		System.out.println(q.poll());
		
		
	}

}
