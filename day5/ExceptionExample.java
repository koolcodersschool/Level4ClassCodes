package day5;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		//int num = 8.9; - this is compile error. We need to fix it
		//either changing int to double or changing decimals to whole number.
		
		int[] nums = new int[3];
		nums[0] = 2;
		nums[1] = 5;
		nums[2] = 7;
		//nums[3] = 90;
		//nums[4] = 89;
		
		int result = 9/0;
		System.out.println("result = " + result);
		
	}

}
