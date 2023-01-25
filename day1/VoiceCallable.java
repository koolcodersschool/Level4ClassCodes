package day1;

public interface VoiceCallable {
	
	
	//variables
	public static final boolean CAN_CALL = true;
	
	//abstract methods
	public abstract void call(String contact);
	
	//static
	public static void decline() {
		System.out.println("The call is declined....");
	}
	
	//default method which belongs interface only
	public default void accept() {
		System.out.println("The call is accepted...");
	}
	
	

}
