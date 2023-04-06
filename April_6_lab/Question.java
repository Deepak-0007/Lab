package April_6_lab;
import java.io.*;// import all the io steam class
import java.io.Serializable;
class demo implements Serializable{
	transient int id;
	String name;
	transient String address;
    public demo(int id,String name,String address) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
}
public class Question {
public static void main(String[] args) throws Exception {
	demo dm=new demo(1,"Deepak","Line_par");
	//serialization
	FileOutputStream f_out=new FileOutputStream("C:\\Users\\Tech Solution\\Desktop\\Question31.txt");
    ObjectOutputStream out=new ObjectOutputStream(f_out);
    out.writeObject(dm);
    out.flush();
    out.close();
    f_out.close();
    System.out.println("done");
  //deserialization
  		FileInputStream e=new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\Question31.txt");
  		ObjectInputStream in=new ObjectInputStream(e);
  		demo obj1=(demo) in.readObject();
  		in.close();
  		System.out.println(obj1.id+" "+obj1.name+" "+obj1.address);
    
    
}
}
