package day4;

import java.util.ArrayList;
import java.util.List;

import day3.*;

public class ShapeCollection {
	
	public static void main(String[] args) {
		//create an array and put 2 squares inside it.
		Square[] squareArray = new Square[2];
		squareArray[0] = new Square();
		squareArray[1] = new Square();
		
		squareArray[0].draw();
		squareArray[1].draw();
		
		
		Shape[] shapeArr = new Shape[4];
		shapeArr[0] = new Shape();
		shapeArr[1] = new Triangle();
		shapeArr[2] = new Square();
		shapeArr[3] = new Diamond();
		
		System.out.println("=========DRAW EACH ONE IN ARRAY WITH FOR LOOP=====");
				
		for(int i = 0; i < shapeArr.length; i++) {
			shapeArr[i].draw();
		}
		
		System.out.println("==========DRAW EACH ONE IN ARRAY WITH FOR EACH LOOP=======");
		
		for(Shape each: shapeArr) {
			each.draw();
		}
		
		System.out.println("===========DRAW WITH ARRAY LIST========");
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Shape());
		shapes.add(new Triangle());
		shapes.add(new Diamond());
		shapes.add(new Square());
		
		for(int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw();
		}
		
		
	}

}
