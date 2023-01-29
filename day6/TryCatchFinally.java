package day6;

import java.net.*;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			URL google = new URL("www.google.com");
		}catch(MalformedURLException e) {
			System.out.println("MalformedURLException caught and handled");
			System.out.println("Reason: " + e.getMessage());
		}finally {
			System.out.println("Finally block - runs always");
		}
		
		System.out.println("New try catch block starts here!!");
		
		try {
			int num = 9;
			System.out.println("num = " + num);
		}catch(Exception e) {
			System.out.println("This is catch block.");
		}finally {
			System.out.println("This is finally block and it runs always.");
		}
		
		System.out.println("After second TRY CATCH FINALLY block");
		
		try {
			System.out.println("Third try catch block...");
			int num = Integer.parseInt("1234ABF");
			System.out.println("END of third try catch block....");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException happened and caught");
			System.out.println("message: " + e.getMessage());
			System.out.println("getCause() " + e.getCause());
		}finally {
			System.out.println("3rd finally block. Runs always!!!");
		}
		
	}

}
