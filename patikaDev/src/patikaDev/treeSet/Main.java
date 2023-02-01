package patikaDev.treeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		// Treeset ile kendimiz �zel bir s�ralama belirtebiliriz

		TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
		students.add(new Student("Mustafa", 100));
		students.add(new Student("Ahmet", 40));
		students.add(new Student("Behl�l", 50));
		students.add(new Student("Duygu", 70));
		students.add(new Student("Cemre", 100));
		students.add(new Student("Cemre", 40));

		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
}
