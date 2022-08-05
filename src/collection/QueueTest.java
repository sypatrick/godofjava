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
		 * �����޼ҵ�
		 * queue.poll()
		 * queue.remove()
		 * queue.clear() // ��� �� ����
		 * 
		*/
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());  
		}
	}

}
