package patikaDev.nestedClass;

public class Out {
	public int a = 5;
	
	
	public class In{
		public int a = 10;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			// iç class'ýn içerisinde dýþ class'ýn deðiþkenine ulaþabilmek için Out.this. kullanýrýz
			System.out.println(Out.this.a);
		}
	}
	
	public static class In2{
		public static int a = 10;
		
		public static void run() {
			System.out.println(a);
			System.out.println(In2.a);
			// iç class'ýn içerisinde dýþ class'ýn deðiþkenine ulaþabilmek için Out.this. kullanýrýz
//			System.out.println(Out.this.a);
		}
	}
	
	
	public void run() {
		In in = new In();
		in.run();
	}
	
	
}
