package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		RightAngledTriangle rat=new RightAngledTriangle(5, 6);
		System.out.println(rat.base);
		System.out.println(rat.height);
		System.out.println(rat.area);
		rat.computeArea();
		Triangle t=new Triangle(10,20);
		System.out.println(t.base);
		System.out.println(t.height);
		System.out.println(t.area);
		t.computeArea();
	}
}
