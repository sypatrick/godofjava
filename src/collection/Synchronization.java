package collection;

public class Synchronization {
	
	private String message;
	
	public static void main(String[] args) {
		
		Synchronization sync = new Synchronization();
		
		Thread thread1 = new Thread(() ->{
			for(int i=0; i<1000; i++) {
				sync.callMe("thread1");
			}
		}
		);
		
		Thread thread2 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				sync.callMe("thread2");
			}
			
		}
		);
		
		
		thread1.start();
		thread2.start();

	}
	
	
	public synchronized void callMe(String whoCallMe) {   // synchronized Ű���� �����ϸ� ������ ���� �ȵǰ� ��� ����
		
		message = whoCallMe;
		
		try {
			long sleep = (long)(Math.random()*100);
			Thread.sleep(sleep);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		if(!message.equals(whoCallMe)) {
			System.out.println(whoCallMe + "====" + message);
		}
	}

}
