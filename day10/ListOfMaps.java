package day10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
	
	public static void main(String[] args) {
		
		List<Map<String, String>> studentsList = new ArrayList<>();
		Map<String, String> studentInfo1 = new LinkedHashMap<>();
		studentInfo1.put("First name", "Kerim");
		studentInfo1.put("Last name", "Keskin");
		
		Map<String, String> studentInfo2 = new LinkedHashMap<>();
		studentInfo2.put("First name", "Ali");
		studentInfo2.put("Last name", "Suleymanov");
		
		studentsList.add(studentInfo1);
		studentsList.add(studentInfo2);
		
		
		System.out.println(studentsList.get(0).get("Last name"));
		System.out.println(studentsList.get(1).get("First name"));
	}

}
