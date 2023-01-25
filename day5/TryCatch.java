package day5;

public class TryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("BEFORE TRY CATCH");
		
		try {
			System.out.println("In first try block");
			int result = 8/0;
			System.out.println("After 8/0");
		}catch(ArithmeticException e) {
			System.out.println("Exception happened and was caught");
			System.out.println("and handled! " + e);
		}
		
		System.out.println("AFTER TRY CATCH");
		
		try {
			System.out.println("In second try block");
			String str = "Java is fun!!!";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(30));
			System.out.println(str.charAt(1));
		}catch(Exception e) {
			System.out.println("Exception happened in Try block in line 24 and caught");
		}
		
		System.out.println("After second TRY CATCH");
		
	}

}
