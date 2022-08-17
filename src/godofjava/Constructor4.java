package godofjava;

public class Constructor4 {
	
	int a;
	int b;
	
	public Constructor4() {
		a = 10;
		b = 20;
	}
	
	void display(Constructor4 obj) {
		System.out.println(obj.a + "   " + obj.b);
	}
	
	void get() {
		display(this);
	}
	
	public static void main(String[] args) {
		Constructor4 test = new Constructor4();
		test.get();

	}

}
