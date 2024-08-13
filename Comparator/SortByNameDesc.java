package Comparator;

import java.util.Comparator;

public class SortByNameDesc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return -1*s1.name.compareTo(s2.name);
	}

}
