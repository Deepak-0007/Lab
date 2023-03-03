package march2;

public class library { // class name 
	private int bookId; // instance variable
	private String bookName;
	private String bookAuthor;
	public int getbookId() {  // for encap us getter method
		return bookId;
	}
	public void setbookId(int bookId) { // for encap.... setter method use
		this.bookId=bookId;
	}
	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}
	public String getbookAuthor() {
		return bookAuthor;
	}
	public void setbookAuthor(String bookAuthor) {
		this.bookAuthor=bookAuthor;
	}

}
