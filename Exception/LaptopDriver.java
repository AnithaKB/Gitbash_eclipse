package Exception;

import java.util.ArrayList;
import java.util.ListIterator;

public class LaptopDriver {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Laptop(1, "Dell", 50000) );
		al.add(new Laptop(2, "HP", 45000) );
		al.add(new Laptop(3, "Sony", 70000) );	
		
		System.out.println(al);
		
		ListIterator li=al.listIterator(0);
		while(li.hasNext()) {
			System.out.println(((Laptop)li.next()).sno);
		}
		ListIterator li1=al.listIterator(0);
		while(li1.hasNext()) {
			System.out.println(((Laptop)li1.next()).name);
		}
		ListIterator li2=al.listIterator(0);
		while(li2.hasNext()) {
			System.out.println(((Laptop)li2.next()).price);
		}
	}

}
