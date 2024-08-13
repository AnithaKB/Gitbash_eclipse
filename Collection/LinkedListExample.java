package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(1,25);
		
		System.out.println(li.size());
		System.out.println(li);
		
		for (Object o : li) {
			System.out.println(o);
		}
		Iterator i=li.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}
