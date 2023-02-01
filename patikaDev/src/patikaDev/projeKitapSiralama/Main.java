package patikaDev.projeKitapSiralama;

import java.util.Date;
import java.util.TreeSet;

import patikaDev.projeKitapListesi.Book;

public class Main {

	public static void main(String[] args) {

		TreeSet<NBook> books = new TreeSet<>(new OrderNameComparator());
		books.add(new NBook("abc", "asdasd", 101, new Date()));
		books.add(new NBook("jlk", "qwe", 245, new Date()));
		books.add(new NBook("vb", "rty", 145, new Date()));
		books.add(new NBook("op", "yuý", 90, new Date()));
		books.add(new NBook("hköh", "ýjo", 745, new Date()));
		books.add(new NBook("ojl", "dfsb", 12, new Date()));
		books.add(new NBook("seghdgf", "asdafaas", 654, new Date()));
		
		
		books.stream().forEach(item -> System.out.println(item.getBookName()));
		
		TreeSet<NBook> books2 = new TreeSet<>(new OrderPageComparator());
		books2.add(new NBook("abc", "asdasd", 101, new Date()));
		books2.add(new NBook("jlk", "qwe", 245, new Date()));
		books2.add(new NBook("vb", "rty", 145, new Date()));
		books2.add(new NBook("op", "yuý", 90, new Date()));
		books2.add(new NBook("hköh", "ýjo", 745, new Date()));
		books2.add(new NBook("ojl", "dfsb", 12, new Date()));
		books2.add(new NBook("seghdgf", "asdafaas", 654, new Date()));
		
		books2.stream().forEach(item -> System.out.println(item.getPage()));
		
	}
}