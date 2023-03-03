package march2;
import java.util.Scanner;
public class printsumodd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int count=0;
	for(int i=0;i<=n;i++) {
		if(i%2!=0)
		{
			 count=count+i;
		}
		
	}
	System.out.println("sum of odd number is :" +count);
}
}
