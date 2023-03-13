package day11;

public class MutableClass {
	
	private String comment;
	
	public MutableClass append(String moreComment) {
		comment += moreComment;
		return this;
	}
	
	public MutableClass(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void displayInfo() {
		System.out.println("comment = " + comment);
	}
	

}
