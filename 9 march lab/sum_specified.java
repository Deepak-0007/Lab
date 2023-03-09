package lab; // package name
import java.util.*; // import all in built class
public class sum_specified { // main class
public static void main(String[] args) {  // main method 
	Scanner sc=new Scanner(System.in);  // Scanner class
	System.out.println("Enter the number"); // enter the number of which to want to sum
	int n=sc.nextInt();   // input the number for which you find the sum 
	int arr[]= {2,3,4,8,3}; // array 
	for(int i=0;i<arr.length;i++) { // initilaztion of array
		for(int j=i+1;j<arr.length;j++) { // second array
			if(arr[i]+arr[j]==n) {  // logic 
				System.out.println("elment of first array "+arr[i] +" "+ "element of second arr "+arr[j]+" "+"number that you want to sum "+n);
			}
		}
	}
}
}
