package godofjava;


class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}


public class GenericT {
	
	public static void main(String[] args) {
		
		Test<Integer> iObj = new Test<>(15);
		System.out.println(iObj.getObject());
		
		Test<String> iObj1 = new Test<>("String");
		System.out.println(iObj1.getObject());
		
		
	}

}
