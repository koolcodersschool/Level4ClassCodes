package day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	/*
	 * difference between LinkedHashSet and HashSet is:
	 * - HashSet doesn't keep insertion order, but LinkedHashSet keeps.
	 */
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("selenium");
		set.add("html");
		set.add("ruby");
		set.add("sql");
		set.add("python");
		
		System.out.println("size: " + set.size());
		System.out.println(set.toString());
		set.remove("java");
		System.out.println(set.toString());
		
		set.forEach(each -> System.out.println(each));
	}

}
