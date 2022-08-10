package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashmapTest {
	
	
	
	public static void main(String[] args) {
		Age p1 = new Age(33);
		Age p2 = new Age(33);
		Age p3 = new Age(28);
		
		Height h1 = new Height(180);
		Height h2 = new Height(170);
		Height h3 = new Height(160);
		
		Map<Age, Height> map = new HashMap<>();
		
		map.put(p1, h1);
		map.put(p2, h2);
		map.put(p3, h3);
		
		
		Height result = map.get(p1);
		
		System.out.println(result.getHeight());
	}

}


class Age{
	private int age;
	
	
	public Age(int age) {
		this.age = age;
		
	}
	
	
}

class Height{
	private int height;
	
	public Height(int height) {
		
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
}