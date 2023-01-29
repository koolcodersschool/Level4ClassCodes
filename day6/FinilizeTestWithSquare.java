package day6;

import day3.Square;

public class FinilizeTestWithSquare {
	
	public static void main(String[] args) {
		
		Square square1 = new Square();
		Square square2 = new Square();
		Square square3 = new Square();
		
		square1 = null;
		square2 = null;
		square3 = null;
		
		System.gc();
		
	}

}
