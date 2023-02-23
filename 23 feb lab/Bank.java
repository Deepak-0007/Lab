package method_overlaoding;

class bank1{  // parent class
	float getrateOfInterest() { // function
		return 0;
	}
}
  class SBI extends bank1{   // extendin child class
	float getrateOfInterest() {
		return 5;
	}
}
class ICICI extends bank1{
	float getrateOfInterest() {
		return 10;
	}
}
class AXIS extends bank1{
	float getrateOfInterest() {
		return 12;
	}
}
public class Bank {   // main class 
public static void main(String[] args) { // main metho 
	bank1 rate;  // create function
	rate=new SBI();   // calling class 
	System.out.println("rate of sbi bank "+rate.getrateOfInterest());  // print rate of interest
	rate=new ICICI(); 
	System.out.println("rate of icici"+rate.getrateOfInterest());
	rate=new AXIS();
	System.out.println("bank of axis"+rate.getrateOfInterest());
	
}
}
