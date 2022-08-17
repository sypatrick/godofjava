package godofjava;

public class Constructor1 {
	
	private int a;
	private int b;
	
	public Constructor1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println("a = " + a + " b = " + b);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Constructor1 obj = new Constructor1(10, 20);
		
		obj.display();
	}

}
