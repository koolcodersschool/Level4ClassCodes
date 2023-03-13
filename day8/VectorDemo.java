package day8;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> nums1 = new Vector<>();
		List<Integer> nums2 = new Vector<>();
		
		nums2.add(123);
		nums2.add(342);
		nums2.add(567);
		nums2.add(980);
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.toString());
		
		System.out.println(nums2.size());
		
		for(int i = 0; i < nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
	}

}
