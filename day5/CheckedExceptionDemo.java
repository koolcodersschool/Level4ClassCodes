package day5;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Checked Exception in the next line");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Exception caught!!");
		}
		
		
		System.out.println("After Thread.sleep()");
		
		wait5Seconds();
		
		/*
		 * There are 2 ways to handle checked exceptions:
		 * 1 - Put throws keyword in method signature
		 * 2 - Surround it with try and catch block
		 */
		
	}
	
	public static void wait5Seconds() throws Exception {
		System.out.println("Wait 5 seconds");
		Thread.sleep(5000);
		System.out.println("The end of waiting!!!");
	}
	
	

}
