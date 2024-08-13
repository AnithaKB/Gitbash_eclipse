package Map;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	String Dept;
	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Dept=" + Dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Dept, empid, name);
	}
	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		return this.empid == e.empid && this.name==e.name &&  this.Dept==e.Dept;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.empid>e.empid)
		return 1;
		else if(this.empid<e.empid)
			return -1;
		else
			return 0;
	}
	

}
