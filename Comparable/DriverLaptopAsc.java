package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class DriverLaptopAsc {

	public static void main(String[] args) {
		ArrayList<Laptop> al=new ArrayList<Laptop>();
		al.add(new Laptop(5));
		al.add(new Laptop(8));
		al.add(new Laptop(4));
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
