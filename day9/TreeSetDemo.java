package day9;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<Double> treeSet = new TreeSet<>();
		SortedSet<Double> myTreeSet = new TreeSet<>();
		
		myTreeSet.add(666.0);
		myTreeSet.add(2.0);
		myTreeSet.add(456.0);
		myTreeSet.add(345.0);
		myTreeSet.add(15.0);
		myTreeSet.add(1.0);
		myTreeSet.add(0.0);
		
		System.out.println(myTreeSet.size());
		System.out.println(myTreeSet.toString());
		
	}

}
