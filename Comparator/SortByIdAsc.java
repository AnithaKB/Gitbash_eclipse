package Comparator;

import java.util.Comparator;

public class SortByIdAsc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.id>s2.id) {
			return 4;
		}
		else if (s1.id<s2.id) {
			return -2;
		}
		else {
			return 0;
		}
		
	}
	

}
