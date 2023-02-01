package patikaDev.hashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class Main {

	public static void main(String[] args) {
		HashSet<String> values = new HashSet<String>();
		String name = "Ahmet";
		String name3 = "Aslý";
		String name4 = "ajds";
		String name5 = "akþdsb";
		String name2 = new String("Ahmet");
		values.add(name);
		values.add(name2);
		values.add(name3);
		values.add(name4);
		values.add(name5);

//		values.stream().forEach(item -> System.out.println(item));
//		values.stream().forEach(System.out::println);
		String max = values.stream().max(Comparator.comparing(String::valueOf)).get();

		Iterator<String> it = values.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
