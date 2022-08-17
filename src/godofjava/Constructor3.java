package godofjava;

public class Constructor3 {
	
	int a;
	int b;
	
	public Constructor3() {
		a = 10;
		b = 20;
	}
	
	public Constructor3 get() {
		return this;
	}
	
	public void diplay() {
		System.out.println("a = " + a + " b = " + b);
	}
	
	
	public static void main(String[] args) {
		
		Constructor3 obj = new Constructor3();
		obj.get().diplay();
	}

}
