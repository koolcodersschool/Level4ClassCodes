package day2;

public class IPhone extends AppleDevice implements Wearable, Codeable{
	String model;
	
	public void navigate() {
		System.out.println("IPhone - navigating using Google Maps app...");
	}
	
	@Override
	public void code() {
		System.out.println(name + " model " + model + " - coding Java in Codingbat");
	}

	@Override
	public void wear() {
		System.out.println(name + " model " + model + " - wearing on arm using case...");
	}

	@Override
	public void use() {
		System.out.println(name + " model " + model + " - using to call, text, play games..");
	}
	
	

}
