package april_13_lab;
import java.util.ArrayList;
public class labQ1 {// class name 
	int n;  // instance variable
	public void StoreOddnumber(int n) { // parameter method to store number
		this.n=n;
	}
	
		ArrayList<Integer>A1=new ArrayList<Integer>(); // new integer array list
		public void PrintOddNumber() { // method for question
			A1=new ArrayList<Integer>();
		for(int i=2;i<n;i++) { // loop condtion
			if(i%2!=0)A1.add(i); // for odd value
		}
	System.out.println(A1);	 // print A1
	}
		ArrayList<Integer>A2= new ArrayList<Integer>();//only take integer type array list
		public void retrieveOddNumber(int n){//user define method
			for (int num:A1) {
				A2.add(num*5);
				System.out.println(num*5);
		}
			System.out.println(A2);
		}
	
public static void main(String[] args) {
	labQ1 l=new labQ1(); // method for all acesss
	l.StoreOddnumber(10);
	l.PrintOddNumber();
	l.retrieveOddNumber(5);
}
}
