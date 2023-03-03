package marlab;

public class main { // main class name
	public static void main(String[] args) {  // main mehtod 
		customer obj=new customer(); // create object
		obj.setAccountName("Deepak"); // set value of all variable 
		obj.setAccountNumber(123456789);
		obj.setAccountbalance(3000.00);
		obj.setwithDrawAmount(300.00);
		System.out.println("Acc.. Holder name: "+obj.getAccountName());  // get value and print the all variable..
		System.out.println("Acc..  number: "+obj.getAccountNumber());
		System.out.println("Acc.. Balance: "+obj.getAccountbalance());
		System.out.println("Acc.. withDrawAmount: "+obj.getwithDrawAmount());
		System.out.println();
		obj.setAccountName("vikash");
		obj.setAccountNumber(234578907);
		obj.setAccountbalance(3200.00);
		obj.setwithDrawAmount(320.00);
		System.out.println("Acc.. Holder name: "+obj.getAccountName());
		System.out.println("Acc..  number: "+obj.getAccountNumber());
		System.out.println("Acc.. Balance: "+obj.getAccountbalance());
		System.out.println("Acc.. withDrawAmount: "+obj.getwithDrawAmount());
	}

}
