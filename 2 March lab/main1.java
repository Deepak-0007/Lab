package march2;

public class main1 { // main class 
	public static void main(String[] args) { // main method 
		library lib=new library(); // create object
		lib.setbookId(219); // set id 
		lib.setbookName("Chetan Bhagat2");// set name of book
		lib.setbookAuthor("Chetan Bhagat");// set author name
		System.out.println("Book Id Number: " +lib.getbookId());// get id 
		System.out.println("Book Id Number: " +lib.getbookName());// book name
		System.out.println("Book Id Number: " +lib.getbookAuthor());// author book
	}

}
