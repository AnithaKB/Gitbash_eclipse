package Queue;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.offer(45);
		ad.offer(23);
		ad.offer(4);
		ad.offer(4);
		ad.offer(23.12);
		ad.offer(90);
			
		ad.addFirst(7);
		ad.addLast(55);
		System.out.println(ad);
		System.out.println(ad.removeFirst());
		System.out.println(ad);
		System.out.println(ad.removeLast());
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		ad.clear();
		System.out.println(ad);
//		System.out.println(ad.getFirst());
		System.out.println(ad.peekFirst());

	}

}
