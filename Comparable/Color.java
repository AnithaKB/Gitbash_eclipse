package Comparable;

public class Color implements Comparable<Color>{
	String name;

	public Color(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}

	@Override
	public int compareTo(Color c) {
		return -1*this.name.compareTo(c.name);
	}

	
}
