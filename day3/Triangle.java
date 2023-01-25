package day3;

public class Triangle extends Shape{
	
	public Triangle() {
		super();
		type = "triangle";
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < 5; i++) {
			for(int j = 5 -i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		outer: for(int i = 0; i < 5; i++) {
			inner1: for(int j = 5 -i; j > 1; j--) {
					System.out.print(" ");
				}
			inner2: for(int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
			System.out.println();
		}
	}

}
