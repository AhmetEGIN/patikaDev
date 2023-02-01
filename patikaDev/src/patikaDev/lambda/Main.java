package patikaDev.lambda;

public class Main {

	public static void main(String[] args) {
		Matematik t1 = new Matematik() {

			@Override
			public int transaction(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		Matematik toplama = (a, b) -> a + b;
		Matematik bolme = (a, b) -> {
			if (b == 0) {
				b = 1;
			}
			return a / b;
		};

		System.out.println(toplama.transaction(2, 3));
		System.out.println(bolme.transaction(2, 1));

	}

}
