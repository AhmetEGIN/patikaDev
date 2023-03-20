package patikaDev.fileClass;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Java'da bir klasör, bir dizin oluþturmamýzý saðlar
		// Java.io paketinin File sýnýfý, dosyalar ve dizinler üzerinde çeþitli iþlemler gerçekleþtirmek için kullanýlýr.
		
		File dizin = new File("test");
		dizin.mkdir();
		// mkdir ile bir dizin oluþturulabilir
		
		String[] list = dizin.list();
		Arrays.stream(list).forEach(item -> System.out.println(item));
		
//		File dosya = new File("test/patika.txt");
//		try {
//			if (dosya.createNewFile()) {
////		  dosya oluþturmak için kullanýlýr
//				System.out.println(dosya.getName() + " oluþturuldu");
//			}else {
//				System.out.println(dosya.getName()  + " isminde bir dosya zaten var.");
//			}
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

//		System.out.println(dosya.delete());
//		 silme iþlemi delete ile yapýlýr
		
		
	}

}
