package lab; //pakage name
import java.util.Scanner;// Scanner import
public class small3number {   //class name
	public static void main(String[] args) {//main class
	Scanner sc=new Scanner(System.in);  // Scanner input
    System.out.println("enter the first number");// print the number by user input
    int a=sc.nextInt();
    System.out.println("enter the Second number");
    int b=sc.nextInt();
    System.out.println("enter the third number");
    int c=sc.nextInt();
    if(a<b&&a<c) {          // logic cond..
    	System.out.println("a is smaller");
    }
    else if(b<a&&b<c) {
    	System.out.println("b is smaller");
    }
    else {
    	System.out.println("c is smaller");
    }
    }
}


