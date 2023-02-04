package day7;

public class ThrowingExceptions {
	
	public static void main(String[] args) {
		ArithmeticException ar = new ArithmeticException();
		RuntimeException r = new RuntimeException("cannot/by 0");
		
		System.out.println("ArithmeticException's message = " + ar.getMessage());
		System.out.println("RuntimeException's message = " + r.getMessage());
		System.out.println();
		
		String userName = "";
		if(userName.isEmpty()) {
			RuntimeException runTime = new RuntimeException("Username should not be empty");
			throw runTime;
		}else {
			System.out.println(userName + " is valid.");
		}
		
	}

}
