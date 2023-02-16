package lab;
class Teacher{  // base calss
	void college(){      // method 
		System.out.println("In the univerty");
	}
	void designation() {  // 2 nd method
		System.out.println("all the ass. proff..");
	}
	void work() {   // 3 rd method
		System.out.println("all are very hard workeras well as smart");
	}
}
public class IT_Teacher extends Teacher {// derived class extend 
public static void main(String[] args) { // main mehtod
	IT_Teacher obj=new IT_Teacher();  // creating obj
	obj.college();   // calling method 
	obj.designation();// calling method 2nd
	obj.work(); // calling method 3rd
			
}
}
