package day3;

public class Square extends Shape{
	
	public Square() {
		super();
		type = "suqare";
	}
	
	@Override
	public void draw() {
		for(int i = 0; i <= 6; i++) {
			if(i == 0 || i == 6) {
				for(int j = 0; j <= 6; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				System.out.print("*  ");
				for(int j = 1; j < 5; j++) {
					System.out.print("  ");
				}
				System.out.print(" *");
				System.out.println();
			}
		}
	}
	
	public void squareMethod() {
		System.out.println("Square Method");
	}
	

}
