package April_6_lab;
import java.io.ByteArrayInputStream; // import ByteArrayInputStream
public class Question2 {  // main class
	public static void main(String[] args) { // main method
		byte[]arr= {68,69,69,80,65,75};//ASCII code char
		ByteArrayInputStream bin=new ByteArrayInputStream(arr);
		int i=0; // condition start
		while((i=bin.read())!=-1) {
			char ch=(char)i;// coverting to char
			System.out.println("ASCII CODE "+i+" "+"Value is "+ch );
		}
	}
}
