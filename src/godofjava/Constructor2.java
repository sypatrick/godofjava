package godofjava;

public class Constructor2 {
	
	int a;
	int b;
	
	public Constructor2() {
		this(10,20);
		System.out.println("�⺻ ������");
	}
	
	public Constructor2(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("�Ű����� ������");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Constructor2 obj = new Constructor2();
		
	}

}
