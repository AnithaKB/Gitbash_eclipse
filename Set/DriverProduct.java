package Set;

import java.util.TreeSet;

public class DriverProduct {

	public static void main(String[] args) {
		TreeSet<Product> t=new TreeSet<Product>(new SortByIdAsc());
		t.add(new Product(1,"Shirt"));
		t.add(new Product(2,"Laptop"));
		t.add(new Product(3,"Iphone"));
		t.add(new Product(4,"Shoe"));
		
		System.out.println(t);
		
	}

}
