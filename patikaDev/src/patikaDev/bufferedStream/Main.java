package patikaDev.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		
//		Java.io paketinin BufferedInputStream sýnýfý, verileri (bayt cinsinden) daha verimli okumak için diðer giriþ akýþlarýyla birlikte kullanýlýr. 
//		InputStream soyut sýnýfýný geniþletir.
//		BufferedInputStream, 8192 baytlýk bir dahili arabellek tutar.
//		BufferedInputStream'deki okuma iþlemi sýrasýnda, diskten bir bayt yýðýný okunur ve dahili tamponda saklanýr.
//		Ayrýca dahili arabellekten baytlar ayrý ayrý okunur.
//		Böylelikle diskle iletiþim sayýsý azalýr. BufferedInputStream kullanarak bayt okumanýn daha hýzlý olmasýnýn nedeni budur.
		
		
//		try {
//			FileInputStream fileInput = new FileInputStream("src/patika.txt");
//			BufferedInputStream buffInput = new BufferedInputStream(fileInput);
//			
//			int i = buffInput.read();
//			while (i != -1) {
//				System.out.print((char)i);
//				i = buffInput.read();
//			}
//			
//			
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		String data = "Java 102 patikasý";
		try {
			FileOutputStream fileOutput = new FileOutputStream("src/patika.txt", true);
			BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);
			
			byte[] bytes = data.getBytes();
			buffOutput.write(bytes);
			buffOutput.close();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
