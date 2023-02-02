package lab;//package name 
import java.util.Scanner; //import scanner for user input
public class Q1 {  // calss name
	public static void main(String args[]) {	//main method of the class
int input1,input2,input3,input4,input5,output;
 Scanner sc = new Scanner(System.in);   //built new Scanner class for user input
 System.out.println("Enter the first no");  //input of first no
 input1=sc.nextInt();
 System.out.println("Enter the second no");  //input of Second no
 input2=sc.nextInt();
 System.out.println("Enter the third no");   //input of third  no
 input3=sc.nextInt();
 System.out.println("Enter the fourth no");  //input of fourth no
 input4=sc.nextInt();
 System.out.println("Enter the fifth no");   //input of fifth no
 input5=sc.nextInt();
 output= (input1+input2+input3+input4+input5)/5;
 System.out.println("Average of five number"+output);
   

	}
	

}
