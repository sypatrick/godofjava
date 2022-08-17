package godofjava;

public class Constructor5 {
	
	void display() {
		this.show();
		
		System.out.println("display 함수");
	}
	
	void show() {
		System.out.println("show 함수");
	}
	
	public static void main(String[] args) {
		
		Constructor5 test = new Constructor5();
		test.display();

	}

}
