package patikaDev.nestedClass;

public class Out {
	public int a = 5;
	
	
	public class In{
		public int a = 10;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			// i� class'�n i�erisinde d�� class'�n de�i�kenine ula�abilmek i�in Out.this. kullan�r�z
			System.out.println(Out.this.a);
		}
	}
	
	public static class In2{
		public static int a = 10;
		
		public static void run() {
			System.out.println(a);
			System.out.println(In2.a);
			// i� class'�n i�erisinde d�� class'�n de�i�kenine ula�abilmek i�in Out.this. kullan�r�z
//			System.out.println(Out.this.a);
		}
	}
	
	
	public void run() {
		In in = new In();
		in.run();
	}
	
	
}
