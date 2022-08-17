package godofjava;



interface Animal {
	public void cry();
}

interface Pet {
	public void play();
}

class Cat implements Animal, Pet{
	public void cry() {
		System.out.println("��");
	}
	
	public void play() {
		System.out.println("������");
	}
}

class Dog implements Animal, Pet{
	
	public void cry() {
		System.out.println("��");
	}
	public void play() {
		System.out.println("�ķ�ġ��");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.cry();
		cat.play();
		
		dog.cry();
		dog.play();
	}

}
