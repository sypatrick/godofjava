package godofjava;

public class Constructor2 {
	
	int a;
	int b;
	
	public Constructor2() {
		this(10,20);
		System.out.println("기본 생성자");
	}
	
	public Constructor2(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("매개변수 생성자");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Constructor2 obj = new Constructor2();
		
	}

}
