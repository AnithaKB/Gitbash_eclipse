package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ColorSortAsc {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Pink");
		al.add("Black");
		al.add("Yellow");
		al.add("Green");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
