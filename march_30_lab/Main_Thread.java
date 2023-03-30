package march_30_lab;

class ListLoader{//class1
	int arr[];//instance variable
public void loadList(int startNum,int lastNum) {//user define method

for(int i=startNum;i<lastNum;i++) {//loop for sleep
	try {
		Thread.sleep(50);
	}catch(Exception e) {
}
}
}} // question first complete 
class Loader_Thread implements Runnable{//class2 using thread
	ListLoader l1;//Aggregration reference type entity
	int startNum;//instance variable
	int lastNum;
	int []arr;
public	Loader_Thread(int startNum,int lastNum,int []arr){//parameter constructor
	this.startNum=startNum;
	this.lastNum=lastNum;
	this.arr=arr;
	}
	public void run() {//predefine method
		for(int i=startNum;i<lastNum;i++) {
		arr[i]=i;	
		}
	}
} // first question part 2


public class Main_Thread {//main class
public static void main(String[] args) throws InterruptedException {//main method
	// final part and question 
	ListLoader ll1= new ListLoader();//class1 object
	long startTime=System.currentTimeMillis();
	System.out.println("Start time: "+startTime);//to print start time
	ll1.loadList(0, 100);
	long endTime=System.currentTimeMillis();
	System.out.println("end time: "+endTime);//to print end time
	System.out.println("Time taken: "+(endTime-startTime)+" ms");//distance between both the thread
int arr[]=new int[100];//size of array
Loader_Thread ll2= new  Loader_Thread(0,50,arr);//thread1
Loader_Thread ll3= new  Loader_Thread(50,100,arr);//thread2
Thread thread1= new Thread(ll2);
Thread thread2= new Thread(ll3);
thread1.start();//thread1 start
thread2.start();
thread1.join();//join thread
thread2.join();
}
}
