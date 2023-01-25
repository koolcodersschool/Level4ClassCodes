package day2;

public class AppleWatch extends AppleDevice implements Wearable{
	int series;
	
	public void countSteps() {
		System.out.println(name + " series "+ series + " - counting each step...");
	}
	
	@Override
	public void wear() {
		System.out.println("Apple watch series " + series + " - wear on wrist...");		
	}

	@Override
	public void use() {
		System.out.println("Apple watch series " + series + " - using to check time,"
				+ "heartrate, exercise, applepay....");
	}

}
