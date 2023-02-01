package patikaDev.genericsList;

import java.util.Arrays;
import java.util.Iterator;

public class MyList<T> {
	private T[] array;
	private T[] tempArray;
	private int index = 0;
	private int capacity;

	public MyList(int capacity) {
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
//		tempArray = (T[]) new Object[capacity];
	}

	public MyList() {
		this.capacity = 10;
		array = (T[]) new Object[capacity];
//		tempArray = (T[]) new Object[10];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public void add(T value) {

		if (index == array.length) initArray();

		array[index] = value;
		index ++;
	}
	
	public void remove(int idx) {
		for (int i = idx; i < this.index-1; i++) {
			this.array[i] = this.array[i+1];
			
		}
		
	}
	
	
	
	
	public void getLength() {
		System.out.println("Dizinin uzunluðu: " + array.length);
	}
	
	public void getValues() {
		int i = 0;
		while (array[i] != null) {
			System.out.println(array[i]);
			
			i++;
			if (i == this.capacity) {
				break;
			}
		}
//		Arrays.stream(array).forEach(System.out::println);
	}
	

	private void initArray() {

		tempArray = (T[]) new Object[capacity];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];

		}
		array = (T[]) new Object[capacity * 2];

		for (int i = 0; i < capacity ; i++) {
			array[i] = tempArray[i];

		}
		this.capacity = capacity * 2;

	}

}
