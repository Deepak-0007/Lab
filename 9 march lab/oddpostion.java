package lab;// package name
import java.util.Scanner;// import class
public class oddpostion { //main class
public static void main(String[] args) { // main method
Scanner sc=new Scanner(System.in);  //Scanner class
System.out.println("Enter the number of element of array ");
int num=sc.nextInt();// for input
int arr[]=new int [num]; // array declare
 for(int i=0;i<num;i++) { // looping 
	 arr[i]=sc.nextInt();// array input
 }
 System.out.println("odd element of the array is ");
 for(int i = 0 ; i < num ; i++) //array initialize
 {
	
     if(arr[i] % 2 != 0) // logic 
     {
         System.out.print(arr[i]+" ");// print odd position element
     }
 }

}
}
