package Exception;

public class Laptop {

	int sno;
	String name;
	double price;
	
	public Laptop(int sno, String name, double price) {
		this.sno=sno;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Laptop [sno=" + sno + ", name=" + name + ", price=" + price + "]";
	}
}
