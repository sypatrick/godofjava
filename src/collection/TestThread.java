package collection;

public class TestThread {

	public static void main(String[] args) {
		
		shareObject so = new shareObject();
		
		Thread t1 = new Thread(()->{
			so.threadCall(Thread.currentThread().getName());
		});
		
		Thread t2 = new Thread(()-> {
			so.threadCall(Thread.currentThread().getName());
		});
		
		t1.start();
		t2.start();

	}
	
	
}

class shareObject{
	public void threadCall(String th) {  // public synchronized void threadCall() <-- 동기( 결과 순서대로 나옴)
		for(int i=0; i<20; i++) {
			System.out.println(th + " 작업" + i);
		}
		
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}