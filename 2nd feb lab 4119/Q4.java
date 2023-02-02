package lab;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {	//main method of the class
		int input1,input2,add,sub,mul,div,rem;
		 Scanner sc = new Scanner(System.in);   //built new Scanner class for user input
		 System.out.println("Enter the first no");  //input of first no
		 input1=sc.nextInt();
		 System.out.println("Enter the second no");  //input of Second no
		 input2=sc.nextInt();
		 add= input1+input2;
		 sub= input1-input2;
		 mul= input1*input2;
		 div= input1/input2;
		 rem= input1%input2;
		 System.out.println("Average of five number"+add);
		 System.out.println("Average of five number"+sub);
		 System.out.println("Average of five number"+mul);
		 System.out.println("Average of five number"+div);
		 System.out.println("Average of five number"+rem);

}
}
