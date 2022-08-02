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
		ArrayList list1 = new ArrayList(); // �⺻ ������ ����ϸ� �ڵ����� ����� 10���� ����
		
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
		
		
		// ������ �� addAll()�޼ҵ峪 ������ ����ϸ� �ȴ�.
		ArrayList<String> list2 = new ArrayList<>(list);  
		
		// ArrayList<String> list3 = list; �� ���� �����ϸ� �� �Ӹ� �ƴ϶� ��ü�� ��ġ�ϰ� �ִ� �ּұ���
		// ����ϴ� ���̱� ������ list, list2 �� �� �ϳ��� ���� ����Ǿ �Ѵ� �ٲ��.
		ArrayList<String> list3 = list;
		list.add("OMG");
		
		for(String tempData : list3) {
			System.out.println(tempData);
		}
		
	
	}
}
