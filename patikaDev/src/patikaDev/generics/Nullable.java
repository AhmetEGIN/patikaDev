package patikaDev.generics;

public class Nullable <T extends Number> {
	// Integer, Double, Float vb Number class'�ndan gelir
	private final T value;

	public Nullable(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public boolean isNull() {
		return this.getValue() == null;
		
	}
	
	public void run() {
		if (isNull()) {
			System.out.println("Bu de�i�kene de�er atanmam��");
		}
		else {
			
			System.out.println(this.value);
		}
	}
	
}
