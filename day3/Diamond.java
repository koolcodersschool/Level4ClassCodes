package day3;

public class Diamond extends Shape {
	
	public Diamond() {
		super(); //super() - calls parent class constructor
		type = "diamond";
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < 5; i++) {
			System.out.println("    **********".substring(i, 5 + i*2));
		}
		for(int i = 5; i > 0; i--) {
			System.out.println("     ***********".substring(i - 1, 5 + (2*i) -3));
		}
	}
	
	
	
	
	
	
	

}
