package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CitiesHashSet {
	
	public static void main(String[] args) {
		
		Set<City> citySet = new HashSet<>();
		
		City c1 = new City("Chantilly");
		City c2 = new City("New York");
		City c3 = new City("Washington DC");
		City c4 = new City("Fairfax");
		
		citySet.add(c1);
		citySet.add(c2);
		citySet.add(c3);
		citySet.add(c4);
		
		System.out.println(citySet.toString());
		
		for(City each : citySet) {
			System.out.println(each.getName());
		}
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(100);
		numbers.add(100);
		numbers.add(10);
		numbers.add(100);
		
		System.out.println("numbers = " + numbers.toString());
		Set<Integer> numbersSet = new HashSet<>(numbers);
		System.out.println("numbersSet = " + numbersSet.toString());
		
	}

}
