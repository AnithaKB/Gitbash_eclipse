package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSortDesc{
	public static void main(String[] args) {
		ArrayList<Color> al=new ArrayList<Color>();
		al.add(new Color("Red"));
		al.add(new Color("Pink"));
		al.add(new Color("Black"));
		al.add(new Color("Yellow"));
		al.add(new Color("Green"));
		
		for (Color csd : al) {
			System.out.println(csd);
		}
		Collections.sort(al);
		System.out.println("---------------------------------------------------");
		for (Color csd : al) {
			System.out.println(csd);
		}
	}
}
