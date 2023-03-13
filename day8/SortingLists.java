package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("java Script");
		list.add("html");
		list.add("ruby");
		list.add("python");
		list.add("C++");
		list.add("C#");
		
		System.out.println("============ BEFORE SORTING ===========");
		System.out.println(list.toString());
		
		Collections.sort(list);
		
		System.out.println("============ AFTER SORTING ============");
		System.out.println(list.toString());
		
		System.out.println("========== NUMBERS BEFORE SORTING =======");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(456);
		numbers.add(34);
		numbers.add(4342);
		numbers.add(1);
		numbers.add(2000);
		System.out.println(numbers.toString());
		
		Collections.sort(numbers);
		
		System.out.println("============== NUMBERS AFTER SORTING ===========");
		System.out.println(numbers.toString());
		
		System.out.println("max number= " + numbers.get(numbers.size()-1));
		System.out.println("minimum number = " + numbers.get(0));
		
		
	}

}
