package arrays;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(100000);
		list.add(2);
		list.add(87);
		
		System.out.println("size is " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Element " + i + " value: " + list.get(i));
		}
		
		
		ArrayList<Object> test = new ArrayList<Object>();
		test.add(12);
		test.add("asd");
		test.add(null);
		test.add(42);
		
		test.set(3, "test");
		
		for(Object value : test) {
			System.out.println(value);
		}
		
		
	}

}
