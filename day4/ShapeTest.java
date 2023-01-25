package day4;

import day3.*;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Square square = new Square();
		square.draw();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		
		Diamond diamond = new Diamond();
		diamond.draw();
		
		System.out.println("================POLYMORPHISM=================");
		Shape shape1;
		
		shape1 = new Square();
		shape1.draw();
		
		shape1 = new Triangle();
		shape1.draw();
		
		shape1 = new Diamond();
		shape1.draw();
		
		System.out.println("===============CALL DRAW METHOD WITHOUT VARIABLES==========");
		new Triangle().draw();
		new Square().draw();
		new Diamond().draw();
		
		System.out.println("===============CALL 4 SHAPES USING POLYMORPHISM=========");
		Object shapeObject = new Shape();
		Shape squareObject = new Square();
		Shape triangleObject = new Triangle();
		Shape diamondObject = new Diamond();
		
		//Diamond dm = new Shape(); ERROR can NOT put parent object to child reference type
		squareObject.draw();
		triangleObject.draw();
		diamondObject.draw();
		//squareObject.squareMethod();
		((Square) squareObject).squareMethod();// this is down casting
		
		
		
		
	}

}
