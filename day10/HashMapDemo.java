package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	/*
	 We can store data in key and value format in Map.
	 */
	
	
	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		map.put("First name", "Yusif");
		map.put("Last name", "Alasgarli");
		map.put("Grade", 7);
		
		map.put("First name", "Murad");
		map.put("Last name", "Sadigov");
		map.put("Grade", 8);
		
		System.out.println("map = " + map);
		
		Map<Integer, String> studentMap = new HashMap<>();
		HashMap<Integer, String> studentMap2 = new HashMap<>();
		HashMap<Integer, Map<String, String>> studentMap3 = new HashMap<>();
		List<Map<Integer, String>> studentMap4 = new ArrayList<>();
		
		
		studentMap.put(10, "Yusif");
		studentMap.put(20, "Murad");
		studentMap.put(30, "Asad");
		studentMap.put(40, "Senan");
		studentMap.put(50, "Kerim");
		studentMap.put(60, "Ali");
		studentMap.put(70, "Ali");
		studentMap.put(70, "Aman");
		
		System.out.println("studentMap = " + studentMap.toString());
		
		System.out.println(20 + " - " + studentMap.get(20));
		
		System.out.println(50 + " - " + studentMap.get(50));
		studentMap.replace(50, "Aman");
		System.out.println(50 + " - " + studentMap.get(50));
		
		System.out.println("================== size() =================");
		System.out.println("size of studentMap = " + studentMap.size());
		
		System.out.println("================== containsKey() ================");
		System.out.println(studentMap.containsKey(100));
		
		System.out.println("================== containsValue() ================");
		System.out.println(studentMap.containsValue("Kerim"));
		
		System.out.println("================== remove() =================");
		System.out.println(studentMap.remove(70));
		System.out.println(studentMap.toString());
		
		System.out.println("================= isEmpty ===============");
		System.out.println(studentMap.isEmpty());
		System.out.println(studentMap2.isEmpty());
		
		System.out.println("=================== keySet() ================");
		Set<Integer> studentIds = studentMap.keySet();
		System.out.println(studentIds.toString());
		
		System.out.println("=================== values() ================");
		System.out.println(studentMap.values());
		
		
	}

}
