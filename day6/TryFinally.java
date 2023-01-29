package day6;

public class TryFinally {
	
	public static void main(String[] args) {
		try {
			System.out.println("In Try block");
			System.exit(1234);
			System.out.println(9/0);
			
		}finally {
			System.out.println("Finally runs always!!!!");
		}
		
		System.out.println("After try finally block!!!!");
		
	}

}
