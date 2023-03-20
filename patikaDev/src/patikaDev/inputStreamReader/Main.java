package patikaDev.inputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
//		Java.io paketinin Reader sýnýfý, bir karakter akýþýný (Characters Stream) temsil eden soyut bir üst sýnýftýr.
//		Java.io paketinin InputStreamReader sýnýfý, bayt cinsinden verileri karakter cinsinden verilere dönüþtürmek için kullanýlabilir. 
//		Soyut Reader sýnýfýný geniþletir.
//		nputStreamReader sýnýfý, diðer giriþ akýþlarýyla (Input Streams) çalýþýr. 
//		Bayt akýþlarý ve karakter akýþlarý arasýnda bir köprü olarak da bilinir.
//		Bunun nedeni, InputStreamReader'ýn giriþ akýþýndaki baytlarý karakter olarak okumasýdýr.
//		Örneðin, bazý karakterlerin depoda depolanmasý için 2 bayt gerekiyordu. 
//		Bu tür verileri okumak için, 2 baytý birlikte okuyan ve karþýlýk gelen karaktere dönüþtürmek için InputStreamReader sýnýfýný kullanabiliriz.
		
		
		// Byte olduðu için ve farklý bir charset belirleyemediðimiz için örneðin ð,ö,þ,ý gibi Türkçe karakterler okunmuyor
		try {
			FileInputStream fileInput = new FileInputStream("src/patika.txt");
			InputStreamReader inputReader = new InputStreamReader(fileInput);
//			System.out.println(inputReader.ge);
			int i = inputReader.read();
			while (i != -1) {
				System.out.print((char) i);
				i = inputReader	.read();
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
