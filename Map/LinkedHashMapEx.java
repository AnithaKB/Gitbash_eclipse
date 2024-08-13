package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(3, 10);
		lh.put(4, 90);
		lh.put(1, 20);
//		lh.put(3, 60);
		lh.put(10, 100);
		lh.put(null, "");
		
		System.out.println(lh.entrySet());
		System.out.println(lh.get(1));

	}

}
