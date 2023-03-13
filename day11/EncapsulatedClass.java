package day11;

public class EncapsulatedClass {
	
	private String comment;
	
	public EncapsulatedClass(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void displayInfo() {
		System.out.println("comment: " + comment);
	}

}
