package godofjava;



interface Animal {
	public void cry();
}

interface Pet {
	public void play();
}

class Cat implements Animal, Pet{
	public void cry() {
		System.out.println("³É");
	}
	
	public void play() {
		System.out.println("ÇÒÄû±â");
	}
}

class Dog implements Animal, Pet{
	
	public void cry() {
		System.out.println("¸Û");
	}
	public void play() {
		System.out.println("ÈÄ·ÁÄ¡±â");
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
