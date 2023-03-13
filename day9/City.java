package day9;

import java.util.Objects;

public class City {
	
	private String name;
	
	public City(String name) {
		this.name = name;
	}
	
	public City() {
		
	}
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("name: " + name);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		City city = (City) o;
		return Objects.equals(name, city.name);
		
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
	
	
}
