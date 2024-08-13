package Collection;

import java.util.ArrayList;

public class ArrayListRemoveEx {

	public static void main(String[] args) {
		ArrayList bag1=new ArrayList();
		bag1.add("Apple");
		bag1.add("Mango");
		bag1.add("Banana");
		bag1.add("WaterMelon");
		bag1.add("PineApple");
		System.out.println(bag1);
		
//		ArrayList bg=new ArrayList(); //Done by me
//		bg.addAll(bag1);//Done by me
//	    System.out.println(bg);//Done by me
//	    System.out.println(bg.removeAll(bag1));//Done by me
//	    System.out.println(bg);//Done by me
//	    System.out.println(bag1);//Done by me
	    
	    
		ArrayList bag2=new ArrayList(bag1);
		bag2.add("Dragon Fruit");
		bag2.add("Grapes");
		System.out.println(bag2);
		
		System.out.println(bag1.remove("WaterMelon"));
		System.out.println(bag1 +" bag 1");
		System.out.println(bag2.remove(2));
		System.out.println(bag2 +" bag 2 ");
		bag1.retainAll(bag2);
		System.out.println(bag1);
		bag1.removeAll(bag2);
		System.out.println(bag1);
		bag2.clear();
		System.out.println(bag2);

	}

}
