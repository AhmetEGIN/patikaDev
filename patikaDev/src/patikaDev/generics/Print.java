package patikaDev.generics;

public class Print {
	// Normal bir s�n�f�n i�erisinde generic metot kullan�labilir
	
	public static <T> void printArray(T[] values) {
		for(T value : values) {
			System.out.println(value);
		}
	}
	
	
}
