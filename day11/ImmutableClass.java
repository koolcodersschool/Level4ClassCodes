package day11;

public final class ImmutableClass {
	
	private String comment;
	
	public ImmutableClass(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void displayInfo() {
		System.out.println("comment = " + comment);
	}

}
