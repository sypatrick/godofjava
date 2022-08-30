package godofjava;



public class ThreadLocalTest {
	
	public void runTest() {
		for (int threadCount = 1; threadCount <= 5; threadCount++) {
			final LocalUserThread thread = new LocalUserThread();
			thread.start();
		}
	}

	public static void main(String[] args) {
		
		
		
		new ThreadLocalTest().runTest();
	}

}
