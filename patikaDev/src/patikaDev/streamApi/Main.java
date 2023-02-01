package patikaDev.streamApi;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(7);
		list.add(63);
		list.add(63);
		
		
		list.stream().forEach(num -> System.out.print(num + " "));
		System.out.println();
		list.stream().filter(item -> item > 40).forEach(item -> System.out.print(item + " "));
		System.out.println();
		list.stream().distinct().forEach(num -> System.out.print(num + " "));
		System.out.println();
		list.stream().sorted().forEach(num -> System.out.print(num + " "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		// Listeden kaç eleman alacaðýmýzý belirtmek için .limit kullanýlýr
		list.stream().limit(5).forEach(num -> System.out.print(num + " "));
		System.out.println();
		list.stream().skip(3).limit(5).forEach(num -> System.out.print(num + " "));
		System.out.println();
		long a = list.stream().distinct().filter(num -> num>25).count();
		System.out.println(a);
		
		boolean match = list.stream().anyMatch(num -> num==25);
		System.out.println(match);
		boolean all = list.stream().allMatch(num -> num>25);
		System.out.println(all);
		boolean none = list.stream().noneMatch(num -> num<0);
		System.out.println(none);
		list.stream().map(item -> item * 2).forEach(num -> System.out.print(num + " "));
		System.out.println();
		list.stream().map(item -> Math.sqrt(item)).forEach(num -> System.out.print(num + " "));
		System.out.println();
		System.out.println();
		
		
	}

}
