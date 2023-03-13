package day11;

public class Test {
	
	public static void main(String[] args) {
		EncapsulatedClass encapsulatedClass = new EncapsulatedClass("Focus to Java");
		encapsulatedClass.displayInfo();
		encapsulatedClass.setComment("Do NOT be distracted");
		System.out.println(encapsulatedClass.getComment());
		
		System.out.println("=================== IMMUTABLE CLASS ===================");
		ImmutableClass immutableClass = new ImmutableClass("This is a comment");
		immutableClass.displayInfo();
		ImmutableClass immutableClass2 = new ImmutableClass("Can I change the previous comment");
		System.out.println(immutableClass2.getComment());
		System.out.println(immutableClass.getComment());
		
		System.out.println("=================== MUTABLE CLASS ======================");
		MutableClass mutableClass = new MutableClass("Java is FUN!!!");
		mutableClass.displayInfo();
		mutableClass.append("\nYes TRUE JAVA IS FUN!!!");
		mutableClass.displayInfo();
		mutableClass.append("\nI gues you are right");
		mutableClass.displayInfo();
		
		
	}

}
