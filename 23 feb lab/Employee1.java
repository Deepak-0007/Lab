package method_overlaoding;

class Employee{  // parent class
	int IncrementSalary(){   // method and function
		return 0;        
	}
}
class Developer extends Employee{ // child extend in parent classs
	int IncrementSalary() {   // method and function
		return 3000;
	}
}
class Manger extends Employee{  // child class extend parent class
	int IncrementSalary() {
		return 4000;
	}
}

public class Employee1 {    // main class
public static void main(String[] args) {   // main method 
Employee Increment; // funtion calling
Increment=new Developer(); // calling class developer
System.out.println("Increment of Developer Salary" + Increment.IncrementSalary());// print increntment
Increment=new Manger();
System.out.println("Increment of Manger Salary" + Increment.IncrementSalary());
}
}
