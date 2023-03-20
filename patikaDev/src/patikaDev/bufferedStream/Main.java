package patikaDev.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		
//		Java.io paketinin BufferedInputStream s�n�f�, verileri (bayt cinsinden) daha verimli okumak i�in di�er giri� ak��lar�yla birlikte kullan�l�r. 
//		InputStream soyut s�n�f�n� geni�letir.
//		BufferedInputStream, 8192 baytl�k bir dahili arabellek tutar.
//		BufferedInputStream'deki okuma i�lemi s�ras�nda, diskten bir bayt y���n� okunur ve dahili tamponda saklan�r.
//		Ayr�ca dahili arabellekten baytlar ayr� ayr� okunur.
//		B�ylelikle diskle ileti�im say�s� azal�r. BufferedInputStream kullanarak bayt okuman�n daha h�zl� olmas�n�n nedeni budur.
		
		
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
		
		
		String data = "Java 102 patikas�";
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
