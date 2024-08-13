package Map;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "Smith");
		hm.put(2, "Dinga");
		hm.put("Three", "Martin");
		hm.put(null, null);
		hm.put(null, "hi");
		hm.put(null, "hello");
		System.out.println(hm);
		
		System.out.println(hm.remove("Three"));
		System.out.println(hm.containsKey(null));
		System.out.println(hm.containsValue("D"));
		System.out.println(hm.get(2));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		HashMap hm2=new HashMap();
		hm2.putAll(hm);
		System.out.println(hm2.entrySet());
	}

}
