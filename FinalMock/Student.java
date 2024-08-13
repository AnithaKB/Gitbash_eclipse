package FinalMock;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id +"id:"+ name +"name:";
		
	}

	public boolean equals(Object o) {
		Student s=(Student)o;
		return this.id==s.id && this.name==s.name;
	}
}
