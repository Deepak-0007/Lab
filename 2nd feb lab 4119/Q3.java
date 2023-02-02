package lab;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {	//main method of the class
		int num1,num2,temp;// for number1 and number2 and temparory variable as temp
		 Scanner sc = new Scanner(System.in);   //built new Scanner class for user input
		 System.out.println("Enter the first no");  //input of first no
		 num1=sc.nextInt();
		 System.out.println("Enter the second no");  //input of Second no
		 num2=sc.nextInt();
		 temp=num1;
		 num1=num2;
		 num2=temp;
		 System.out.println("after swapping"+num1);
		 System.out.println("after swapping"+num2);
				 
	}	

}
