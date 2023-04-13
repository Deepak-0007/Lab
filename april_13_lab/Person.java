package april_13_lab;
import java.util.ArrayList;// package in built
public class Person {  // class name
public static void main(String[] args) { // main method 
	ArrayList<String> arr=new ArrayList<String>();// new array string list
	arr.add("Ram"); // all array for printing
	arr.add("Shyam");
	arr.add("Deepak");
	arr.add("Monu");
	arr.add("Jatin");
	arr.add("Gyani");
	arr.add("Harinder");
	arr.add("Nitesh");
	arr.add("Nishant");
	arr.add("Abhishek");
	System.out.println("list of the array element"); // list off the array
	for(String s:arr) {  // for each loop
		System.out.println(s); // print list form 
	}
}
}
