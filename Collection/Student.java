package Collection;

public class Student {
	
	String name;
	String section;
	String dept;
     
	
	public Student(String name,String section,String dept) {
		this.name=name;
		this.section=section;
		this.dept=dept;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", section=" + section + ", dept=" + dept + "]";
	}


	
}
