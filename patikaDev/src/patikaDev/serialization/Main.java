package patikaDev.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {

//		Java bilindi�i �zerine nesneye y�nelik bir dil. Ancak nesneleri bazen JVM d���nda kullanmak gerekebiliyor. 
//		Fakat d��ar�da kulland���m�z bir nesnemizi tekrar i�eride kullanmak istedi�imizde nesne i�inde kullan�lan de�erlerin hangi tipte oldu�unu ��renemiyoruz. 
//		Yani herhangi bir s�n�ftan bir nesne �retip, bunu bir dosyaya yazd�r�p onu tekrar dosyadan okudu�umuzda de�erlerin tip bilgisini bilememe problemimiz var. 
//		��te tam bu durumda Java Serialization API yard�m�m�za ko�uyor.
		
		// E�er car class'�nda Serializable interface'ini implemente etmeseydik java bu i�lemlere izin vermeyecekti
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
