package patikaDev.generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// undefined
		String s;		
		
		//null
		String s1 = null;
		
		//empty
		String s2 = "";
//		
//		String s3 = "asdn";
//		Nullable<String> nullable = new Nullable(s1);
//		nullable.run();
		
		int u = 132;
		Nullable<Integer> nullableInt = new Nullable<Integer>(u);
		nullableInt.run();
//		
		
		String[] a = {"Java", "102", "Patika"};
		Integer[] b = {2,3,5,7};
		Character[] c = {'j', 'a', 'v' , 'a'};
		
		
		// Generic metotlarý kullanýrken tip belirtmeye gerek yok
	
		Print.printArray(a);
		Print.printArray(b);
		Print.printArray(c);
		
		
	}

}
