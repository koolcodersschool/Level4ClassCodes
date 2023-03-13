package day8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList1 = new LinkedList<>();
		List<String> linkedList2 = new LinkedList<>();
		
		linkedList1.add("java");
		linkedList1.add("python");
		linkedList1.add("C#");
		linkedList1.add("C++");
		linkedList1.add("html");
		linkedList1.add("java script");
		
		System.out.println(linkedList1.get(0));
		System.out.println(linkedList1.getFirst());
		System.out.println(linkedList1.getLast());
		System.out.println(linkedList1.get(linkedList1.size() - 1));
		
		System.out.println(linkedList1.toString());
		
		for(String each : linkedList1) {
			System.out.println("each = " + each);
		}
		
	}

}
