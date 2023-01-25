package day1;

public abstract class MessagingApp {
	
	public MessagingApp() {
		System.out.println("MessagingApp constructor...");
	}
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messenger";
	
	//abstract method
	public abstract void sendMessage(String message);
	
	//non-abstract method. It needs object in order to be able to call it
	public void launch() {
		System.out.println("Messaging app is launching....");
	}
	
	//static method
	public static void close() {
		System.out.println("Messaging app is closing....");
	}
	
	
	

}
