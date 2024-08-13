package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class DriverLaptopDesc {

	public static void main(String[] args) {
		ArrayList<LaptopDesc> al=new ArrayList<LaptopDesc>();
		al.add(new LaptopDesc (5));
		al.add(new LaptopDesc(8));
		al.add(new LaptopDesc(4));
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
//		for (LaptopDesc l : al) {
//			System.out.println(l);
//		}
//		Collections.sort(al);
//		System.out.println("---------------------------------------------------");
//		for (LaptopDesc l : al) {
//			System.out.println(l);
//	}
	}}


