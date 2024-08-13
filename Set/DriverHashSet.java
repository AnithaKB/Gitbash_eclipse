package Set;

import java.util.HashSet;
import java.util.Iterator;

public class DriverHashSet {

	public static void main(String[] args) {
		/*HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(new Employee(1, "Dinga"));
		hs.add(new Employee(2, "Smith"));
		hs.add(new Employee(3, "Martin"));
		hs.add(new Employee(1, "Dinga"));
		
		System.out.println(hs);*/
		
		HashSet hs=new HashSet();
		hs.add(77);
		hs.add(25.2);
		hs.add(null);
		hs.add("Smith");
		hs.add(77);
		System.out.println(hs);
		
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
