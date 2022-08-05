package collection;

public class ArrayQueue {

	int MAX = 1000;
	int front;
	int rear;
	int[] queue;
	
	public ArrayQueue() {
		front = 0;
		rear = 0;
		queue = new int[MAX];
	}
	
	public boolean queueIsEmpty() {
		
		return front == rear;
		
	}
	
	public boolean queueIsFull() {
		if(rear == MAX-1) {
			return true;
		}
		else return false;
	}
	
	public int size() {
		return front-rear;
	}
	
	public void push(int value) {
		if(queueIsFull()) {
			System.out.println("Queue is Full");
			return;
		}
		queue[rear++] = value;
	}
	
	public int pop() {
		if(queueIsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int popValue = queue[front++];
        return popValue;
		
	}
	
	public int peek() {
		if(queueIsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int popValue = queue[front];
		return popValue;
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayQueue test = new ArrayQueue();
		
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(1);
		
		while(!test.queueIsEmpty()) {
			System.out.println(test.pop());
		}
	
		test.peek();
	}

}
