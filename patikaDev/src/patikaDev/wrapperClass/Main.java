package patikaDev.wrapperClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper s�n�flar ilkel (primitive) veri tiplerinin class'lar�d�r
		
		Integer a = 10;
		int b = 5;
		
		// A�a��daki i�leme autoboxing denir
		Integer c = b;
		
		// Boxing i�lemi: BU i�leme gerek yok, java autoboxing ile hallediyor.
		Integer d = Integer.valueOf(b);
		
		//Autounboxing
		int e = c;
		
		// Unboxing: Bu i�lem java taraf�ndan autounboxing ile halledilir
		int i = c.intValue();
		
	}

}
