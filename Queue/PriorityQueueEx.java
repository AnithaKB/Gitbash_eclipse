package Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.offer(9);
		p.offer(2);
		p.offer(20);
		p.offer(11);
		p.offer(11);
//		p.offer(null);
//		p.offer("hi");
		
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p.peek());
		System.out.println(p);
	}

}
