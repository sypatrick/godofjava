package godofjava;

public class Constructor5 {
	
	void display() {
		this.show();
		
		System.out.println("display �Լ�");
	}
	
	void show() {
		System.out.println("show �Լ�");
	}
	
	public static void main(String[] args) {
		
		Constructor5 test = new Constructor5();
		test.display();

	}

}
