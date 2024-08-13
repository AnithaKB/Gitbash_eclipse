package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(2, "Veena"));
		al.add(new Student(4, "Reena"));
		al.add(new Student(1, "Meena"));
		al.add(new Student(3, "Leena"));
		al.add(new Student(5, "Teena"));
		
		for (Student s : al) {
			System.out.println(s);
		}
		Collections.sort(al, new SortByIdAsc());
		System.out.println("============================================================");
		for (Student s : al) {
			System.out.println(s);
		}
		Collections.sort(al, new SortByIdDesc());
		System.out.println("============================================================");
		for (Student s : al) {
			System.out.println(s);
		}
		Collections.sort(al, new SortByNameAsc());
		System.out.println("============================================================");
		for (Student s : al) {
			System.out.println(s);
		}
		Collections.sort(al, new SortByNameDesc());
		System.out.println("============================================================");
		for (Student s : al) {
			System.out.println(s);
		}
	}

}
