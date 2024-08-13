package Set;

import java.util.Objects;

public class Product {

	int id;
	String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object o) {
		Product p = (Product) o;
		return this.id == p.id && this.name == p.name;
	}
	
}
