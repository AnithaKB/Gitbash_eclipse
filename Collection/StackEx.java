package Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		/*System.out.println(s);
		System.out.println(s.pop());//40
		System.out.println(s);
		System.out.println(s.pop());//30
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(10));
		System.out.println(s.search(20));
		System.out.println(s);*/
		
		System.out.println(s.search(10));
		System.out.println(s.search(20));
		System.out.println(s.search(30));
		System.out.println(s.search(40));
//		s.clear();
		System.out.println(s.search(10));
		System.out.println(s.get(3));
		
		
	}
	}


