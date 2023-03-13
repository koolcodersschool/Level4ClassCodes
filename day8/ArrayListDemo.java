package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();//creating object from ArrayList class
		List<Integer> list2 = new ArrayList<>();//Creating arrayList using Polymorphism
		Collection<Integer> list3 = new ArrayList<>();
		Iterable<Integer> list4 = new ArrayList<>();
		
		list1.add(34);
		list1.add(678);
		list1.add(456);
		list1.add(987);
		list1.add(980);
		System.out.println(list1.toString());
		
	}

}
