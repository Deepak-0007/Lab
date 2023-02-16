package lab;
class Arithmetic{  // class name where add method is delcaler
	int add(int a,int b) {  // paratmeter method 
		int add=a+b;   // logic
		System.out.println("sum of numbers" +add);  // pritn
		return add;  // return method
	}
	
}

public class Adder extends Arithmetic { // extend class in chid class
	public static void main(String[] args) { // main method
		Arithmetic obj=new Arithmetic(); // creating object
		obj.add(5,5);
	}

}
