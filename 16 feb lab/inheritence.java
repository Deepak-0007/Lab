package lab;
class A{  // parent class 
	void show() {  // method
		System.out.println("this is class A");//for print
	}
}
class B extends  A{  // dervied class b 
	void display() {   // method 
		System.out.println("this is class B");
	}
	
}
class C extends B{
	void print() {
		System.out.println("this is class C");
	}
	
}

public class inheritence {    // main class name 
	public static void main(String[] args) {  // main method 
		C object=new C();  // creating object
		object.show(); // calling method from class a
		object.display(); // calling method from class b
	    object.print();   // calling method from class c
	}

}
