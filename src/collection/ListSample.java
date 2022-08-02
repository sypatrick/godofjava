package collection;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		 
		ListSample sample = new ListSample(); 
		
		sample.checkArrayList1();
		//sample.checkArrayList2();
		sample.checkArrayList3();
		sample.checkArrayList4();
	}
	
	
	public void checkArrayList1() {
		ArrayList list1 = new ArrayList(); // 기본 생성자 사용하면 자동으로 사이즈가 10으로 생성
		
		list1.add("Array Sample");
	}
	
	
	public void checkArrayList2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		for(String tempData : list) {
			System.out.println(tempData);
		}
	}
	
	public void checkArrayList3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("0");
		list2.addAll(list);
		
		for(String tempData : list2) {
			System.out.println(tempData);
		}
	}
	
	public void checkArrayList4() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		
		// 복사할 땐 addAll()메소드나 생성자 사용하면 된다.
		ArrayList<String> list2 = new ArrayList<>(list);  
		
		// ArrayList<String> list3 = list; 와 같이 선언하면 값 뿐만 아니라 객체가 위치하고 있는 주소까지
		// 사용하는 것이기 때문에 list, list2 둘 중 하나만 값이 변경되어도 둘다 바뀐다.
		ArrayList<String> list3 = list;
		list.add("OMG");
		
		for(String tempData : list3) {
			System.out.println(tempData);
		}
		
	
	}
}
