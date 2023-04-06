package April_6_lab;
import java.io.FileInputStream; // import input output file
import java.io.FileOutputStream;
import java.util.Scanner; // import Scanner
public class Question1 { // class name
	public static void main(String[] args) { // main method
	int choice; // choiice 
	Scanner sc=new Scanner(System.in);// Scanner class
	System.out.println("Enter the choice what you want");
	System.out.println("press 1 for read the data from console and store it in file");
	System.out.println("press 2 for print the data from the file");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		try {
			// make object and give path of the program
			FileOutputStream f=new FileOutputStream("C:\\Users\\Tech Solution\\Desktop\\Lab_for_input.txt");
			String s="welcome to the world of java"; // string 
			byte b[]=s.getBytes(); //convert byte code into string  
			f.write(b); // to write byte code in the string
			f.close();// close
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		break;
	case 2:
		try {
			FileInputStream f= new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\Lab_for_Output.txt");//source path
			int i;
			while((i=f.read())!=-1){//print one by one  all character
				System.out.print((char)i);//convert int into character
			}
			f.close();
			
			}catch(Exception e) {
				System.out.println(e);
			}	
	}
	}

}
