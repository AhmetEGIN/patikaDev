package patikaDev.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {

//		Java bilindiði üzerine nesneye yönelik bir dil. Ancak nesneleri bazen JVM dýþýnda kullanmak gerekebiliyor. 
//		Fakat dýþarýda kullandýðýmýz bir nesnemizi tekrar içeride kullanmak istediðimizde nesne içinde kullanýlan deðerlerin hangi tipte olduðunu öðrenemiyoruz. 
//		Yani herhangi bir sýnýftan bir nesne üretip, bunu bir dosyaya yazdýrýp onu tekrar dosyadan okuduðumuzda deðerlerin tip bilgisini bilememe problemimiz var. 
//		Ýþte tam bu durumda Java Serialization API yardýmýmýza koþuyor.
		
		// Eðer car class'ýnda Serializable interface'ini implemente etmeseydik java bu iþlemlere izin vermeyecekti
		Car c1 = new Car("Audi", "A6");
//		FileOutputStream outputFile;
//		try {
//			outputFile = new FileOutputStream("src/araba.txt");
//			ObjectOutputStream output = new ObjectOutputStream(outputFile);
//			output.writeObject(c1);
//			output.close();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		try {
			FileInputStream inputFile = new FileInputStream("src/araba.txt");
			ObjectInputStream input = new ObjectInputStream(inputFile);
			Car newCar = (Car) input.readObject();
			System.out.println(newCar.getBrand() + " / " + newCar.getModel() );
			
			inputFile.close();
			input.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
