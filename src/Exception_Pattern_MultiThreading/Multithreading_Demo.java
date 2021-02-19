package Exception_Pattern_MultiThreading;
 
public class Multithreading_Demo
{
	public static void main(String[] args)
	{
	MyThread r = new MyThread();
	//Thread t= new Thread(r);
	r.start();
	System.out.println("Main Thread");
	}
}
