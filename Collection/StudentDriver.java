package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList <Student> al = new ArrayList<Student>();
		al.add(new Student("Rita","A","CS"));
		al.add(new Student("Sita","B","ECE"));
		al.add(new Student("Gita","C","EEE"));
		al.add(new Student("Nita","D","IT"));		System.out.println(al);

	
	ListIterator<Student> li=al.listIterator(0);
	while(li.hasNext()) {
		System.out.println(li.next().name);
	}
	ListIterator<Student> li1=al.listIterator(0);
	while(li1.hasNext()) {
		System.out.println(li1.next().section);
	}
	ListIterator<Student> li2=al.listIterator(0);
	while(li2.hasNext()) {
		System.out.println(li2.next().dept);
	}
}			
}


