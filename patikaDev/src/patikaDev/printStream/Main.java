package patikaDev.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		
//		Java.io paketinin PrintStream sýnýfý, çýktý verilerini bayt yerine yaygýn olarak okunabilir biçimde (metin) yazmak için kullanýlabilir.
		// Tüm verileri String veri tipinde aktarmamýzý saðlar
//		Diðer çýktý akýþlarýndan farklý olarak, PrintStream ilkel verileri (tamsayý, karakter) bayt yerine metin biçimine dönüþtürür.
//		Daha sonra bu biçimlendirilmiþ verileri çýktý akýþýna yazar.
		
		try {
			PrintStream output = new PrintStream("src/print.txt");
			output.print(123);
			
			
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
