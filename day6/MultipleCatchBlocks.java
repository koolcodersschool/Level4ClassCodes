package day6;

import java.util.Scanner;

public class MultipleCatchBlocks {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		
		try {
			System.out.println("In try block");
			int num = Integer.parseInt(str.substring(0, 3));
			System.out.println("num = " + num);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught");
			System.out.println("message: " + e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught");
			System.out.println("message: " + e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
			System.out.println("message: " + e.getMessage());
		}catch(Throwable e) {
			System.out.println("Throwable caught");
		}finally {
			System.out.println("Finally block runs always.");
			scanner.close();
			System.out.println("Scanner object closed");
		}
		
		System.out.println("After multi catch block...");
		
	}

}
