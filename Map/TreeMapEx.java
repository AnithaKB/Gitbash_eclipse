package Map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(2, "Smith");
		tm.put(5, "Ann");
		tm.put(3, "Dinga");
		tm.put(1, "James");
		System.out.println(tm.entrySet());

	}

}
