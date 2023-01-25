package day2;

public class MacPro extends AppleDevice implements Codeable{
	String model;
	
	public void useAsServer() {
		System.out.println(name + " model " + model + " - using an application server...");
	}
	
	@Override
	public void code() {
		System.out.println(name + " model " + model + " - coding Java in Eclipse...");
	}

	@Override
	public void use() {
		System.out.println(name + " model " + model + " - using grapfic design, movies,"
				+ "video games...");
	}
	
	

}
