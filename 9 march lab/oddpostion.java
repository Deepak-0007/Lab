package lab;
import java.util.Scanner;
public class oddpostion {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of element of array ");
int num=sc.nextInt();
int arr[]=new int [num];
 for(int i=0;i<num;i++) {
	 arr[i]=sc.nextInt();
 }
 System.out.println("odd element of the array is ");
 for(int i = 0 ; i < num ; i++)
 {
	
     if(arr[i] % 2 != 0)
     {
         System.out.print(arr[i]+" ");
     }
 }

}
}
