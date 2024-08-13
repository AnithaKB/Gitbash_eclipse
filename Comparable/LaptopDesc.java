package Comparable;

public class LaptopDesc implements Comparable {
    int ram;
	public LaptopDesc(int ram) {
		super();
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "DriverLaptopDesc [ram=" + ram + "]";
	}
		@Override
		public int compareTo(Object o) {
			LaptopDesc l=(LaptopDesc)o;
			if(this.ram>l.ram) 
				return -1;
			
			else if (this.ram<l.ram) 
				return 3;
			
			else 
				return 0;
			}
		}


