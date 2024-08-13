package Collection;

import java.util.ArrayList;

public class ArrayListSearchEx {

	public static void main(String[] args) {
		ArrayList bag1=new ArrayList();
		bag1.add("Apple");
		bag1.add("Mango");
		bag1.add("Banana");
		bag1.add("WaterMelon");
		bag1.add("PineApple");
		bag1.add("Mango");
		System.out.println(bag1);
		
		ArrayList bag2=new ArrayList(bag1);
		bag2.add("Dragon Fruit");
		bag2.add("Grapes");
		System.out.println(bag2);
		
		System.out.println(bag1.containsAll(bag2));
		System.out.println(bag2.containsAll(bag1));
		System.out.println(bag1.contains("Banana"));
		System.out.println(bag1.contains("Litchi"));
		System.out.println(bag1.indexOf("Apple"));
		System.out.println(bag2.indexOf("Peach"));
		System.out.println(bag1.lastIndexOf("Mango"));
		System.out.println(bag1.isEmpty());
	    bag1.toArray();
	    System.out.println(bag1);
	    System.out.println(bag1.size());

	}

}
