package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramQueue {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);

	}

}
