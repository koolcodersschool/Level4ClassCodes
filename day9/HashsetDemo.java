package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {
    /*
     * SET:
     * - Accepts only unique values
     * HashSet:
     *  - Accepts only unique values
     *  - It doesn't keep insertion order
     * 
     * LinkedHashSet:
     *  - Accepts only unique values
     *  - It keeps insertion order
     * 
     * TreeSet:
     *  - Accepts unique values
     *  - It is sorted by natural order
     */
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set2.add(10);
		set2.add(10);
		set2.add(55);
		set2.add(66);
		set2.add(77);
		set2.add(88);
		set2.add(100);
		
		System.out.println(set2.toString());
		System.out.println(set2.size());
		System.out.println(set2.contains(100));
		
		for(Integer each : set2) {
			System.out.println("number = " + each);
		}
		
		Iterator<Integer> iterateSet2 = set2.iterator();
//		System.out.println(iterateSet2.next());
//		System.out.println(iterateSet2.next());
		System.out.println(iterateSet2.hasNext());
		
		while(iterateSet2.hasNext()) {
			System.out.println("iterate number ==> " + iterateSet2.next());
		}
	}
	
}
