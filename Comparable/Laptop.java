package Comparable;

public class Laptop implements Comparable {
    int ram;

	public Laptop(int ram) {
		super();
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + "]";
	}
	@Override
	public int compareTo(Object o) {
		Laptop l=(Laptop)o;
		if(this.ram>l.ram) {
			return 1;
		}
		else if (this.ram<l.ram) {
			return -3;
		}
		else {
			return 0;
		}
	}
}
