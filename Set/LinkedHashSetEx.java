package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(10);
		lh.add("Dinga");
		lh.add(null);
		lh.add(null);
		lh.add(22.8);
		lh.add(22.8);
		
		System.out.println(lh);
		
		Iterator i= lh.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
