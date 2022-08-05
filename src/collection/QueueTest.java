package collection;

import java.util.*;


public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		/*
		 * 삭제메소드
		 * queue.poll()
		 * queue.remove()
		 * queue.clear() // 모든 값 삭제
		 * 
		*/
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());  
		}
	}

}
