package Exception_Pattern_MultiThreading;

public class MyThread extends Thread 
{
	public void run()
	{
	System.out.println("Child Thread");
	}
	public void run(int i)
	{
	System.out.println("Child Argument Thread");
	}
	
}

/*public class MyThread implements Runnable 
{
	public void run()
	{
	System.out.println("Child Thread");
	}
	
}*/