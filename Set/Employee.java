package Set;

import java.util.Objects;

public class  Employee {

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		return this.id==e.id && this.name==e.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
}
