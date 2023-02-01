package patikaDev.nestedClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out = new Out();
		out.run();
		Out.In in = out.new In();
		in.run();
		System.out.println("---");
		Out.In2.run();
		System.out.println("*************");
		LocalClass local = new LocalClass();
		local.run();
		
		
	}

}
