package Map;

import java.util.TreeMap;

public class DriverEmployee {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> t=new TreeMap<Integer, Employee>();
		Employee e1=new Employee(1006, "Miller", "B");
		Employee e2=new Employee(1007, "Adams", "E");
		Employee e3=new Employee(1003, "Smith", "D");
		Employee e4=new Employee(1009, "Shelly", "C");
		Employee e5=new Employee(1004, "John", "A");
		
		t.put(e1.empid, e1);
		t.put(e2.empid, e2);
		t.put(e3.empid, e3);
		t.put(e4.empid, e4);
		t.put(e5.empid, e5);

		System.out.println(t.entrySet());
	}

}
