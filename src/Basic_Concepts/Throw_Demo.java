package Basic_Concepts;
public class Throw_Demo  
{
	public int division(int a, int b)
	{
		int t=a/b;     
		return t;
	}
	public static void main(String[] args) 
	{
		Throw_Demo p = new Throw_Demo();
		try		
		{
			p.division(10, 0);
		}
		catch(ArithmeticException e)
		{
		//throw new ArithmeticException("Divided by zero is not defined in Mathematics");
		throw new NullPointerException("Null Refernce results into RuntimeException");
			//System.out.println("Exception Successfully Captured");
		}
    }
}