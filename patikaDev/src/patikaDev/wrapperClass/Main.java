package patikaDev.wrapperClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper sýnýflar ilkel (primitive) veri tiplerinin class'larýdýr
		
		Integer a = 10;
		int b = 5;
		
		// Aþaðýdaki iþleme autoboxing denir
		Integer c = b;
		
		// Boxing iþlemi: BU iþleme gerek yok, java autoboxing ile hallediyor.
		Integer d = Integer.valueOf(b);
		
		//Autounboxing
		int e = c;
		
		// Unboxing: Bu iþlem java tarafýndan autounboxing ile halledilir
		int i = c.intValue();
		
	}

}
