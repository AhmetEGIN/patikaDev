package patikaDev.fileClass;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Java'da bir klas�r, bir dizin olu�turmam�z� sa�lar
		// Java.io paketinin File s�n�f�, dosyalar ve dizinler �zerinde �e�itli i�lemler ger�ekle�tirmek i�in kullan�l�r.
		
		File dizin = new File("test");
		dizin.mkdir();
		// mkdir ile bir dizin olu�turulabilir
		
		String[] list = dizin.list();
		Arrays.stream(list).forEach(item -> System.out.println(item));
		
//		File dosya = new File("test/patika.txt");
//		try {
//			if (dosya.createNewFile()) {
////		  dosya olu�turmak i�in kullan�l�r
//				System.out.println(dosya.getName() + " olu�turuldu");
//			}else {
//				System.out.println(dosya.getName()  + " isminde bir dosya zaten var.");
//			}
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

//		System.out.println(dosya.delete());
//		 silme i�lemi delete ile yap�l�r
		
		
	}

}
