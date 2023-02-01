package patikaDev.projeKitapListesi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>() {
			{
				add(new Book("abc", "asdasd", 101, new Date()));
				add(new Book("jlk", "qwe", 245, new Date()));
				add(new Book("vb", "rty", 145, new Date()));
				add(new Book("op", "yuý", 90, new Date()));
				add(new Book("hköh", "ýjo", 745, new Date()));
				add(new Book("ojl", "dfsb", 12, new Date()));
				add(new Book("seghdgf", "asdafaas", 654, new Date()));
			}
		};

		Map<String, String> books = new HashMap<>();

//		bookList.stream().forEach(item -> System.out.println(item.getBookName()));
		bookList.stream().forEach(item -> books.put(item.getBookName(), item.getAuthorName()));
		
		List<Book> realBooks = bookList.stream().filter(item->item.getPage()>100).toList();
		realBooks.stream().forEach(item -> System.out.print(item.getPage() + " "));

	}

}
