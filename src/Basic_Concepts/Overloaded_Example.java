package Basic_Concepts;

public class Overloaded_Example {
	
	public void m1(Integer I)
	{
		System.out.println("integer Argument");
	}
	public void m1(int i)
	{
		System.out.println("float Argument");
	}
	public static void main(String[] args) 
	{
	Overloaded_Example e= new Overloaded_Example();
	Integer P = Integer.valueOf(10);
	int x= P.intValue();
	e.m1(x);
	}

}
