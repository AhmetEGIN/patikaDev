package patikaDev.generics;

public class Print {
	// Normal bir sýnýfýn içerisinde generic metot kullanýlabilir
	
	public static <T> void printArray(T[] values) {
		for(T value : values) {
			System.out.println(value);
		}
	}
	
	
}
