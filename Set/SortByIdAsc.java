package Set;

import java.util.Comparator;

public class SortByIdAsc implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if (p1.id>p2.id) {
			return 2;
		}
			
		 else if(p1.id<p2.id) {
			 return -4;
		 }
		 else
		return 0;
	}

}
