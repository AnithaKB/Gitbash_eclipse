package Collection;

import java.util.ArrayList;

public class ArrayListAddEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(31); //Integer
		al.add(24.7);
		al.add("Smith");
		al.add('h');
		al.add("Dinga");
		al.add(null);
		al.add(24.7);
		al.add(2, 78);
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList al2 =new ArrayList(al);
		System.out.println(al2);

	}

}
