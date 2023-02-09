package lab;// package name
public class contractor2 { // class 
	contractor2 (){ // default con
		System.out.println("Default con");
	}
	int rollno,year;  // give value
	String department,name;
	
	contractor2(int  r,String d,int y,String n){  // parameter 
		rollno=r;
		department=d;
		name=n;
		year=y;
	}
	void show() { // create method 
		System.out.println( rollno+" "+name+" "+year+" "+department);
	    			}
	public static void main(String[] args) {  // main class
		
	
	contractor2 d=new contractor2(21,"Deepak",2,"DCSA");

	d.show(); // calling cons
	contractor2 def_con= new contractor2();
	}

}


