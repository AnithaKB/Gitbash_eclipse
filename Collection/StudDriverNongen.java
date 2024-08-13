package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudDriverNongen {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student("Rita","A","CS"));
		al.add(new Student("Sita","B","ECE"));
		al.add(new Student("Gita","C","EEE"));
		al.add(new Student("Nita","D","IT"));
		System.out.println(al);

	
	ListIterator li=al.listIterator(0);
	while(li.hasNext()) {
		Student s=(Student)li.next();
		System.out.println(s.name);
	}
	ListIterator li1=al.listIterator(0);
	while(li1.hasNext()) {
		Student s1=(Student)li1.next();
		System.out.println(s1.section);
	}
	ListIterator li2=al.listIterator(0);
	while(li2.hasNext()) {
		Student s2=(Student)li2.next();
		System.out.println(s2.dept);
	}


	}

}
