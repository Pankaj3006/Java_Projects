package Exception_Pattern_MultiThreading;

@SuppressWarnings("serial")
class TooYoungException extends Exception
{
TooYoungException(String s)
{
	super(s);	
}
}
@SuppressWarnings("serial")
class TooOldException extends Exception
{
TooOldException(String s)
{
	super(s);	
}
}

public class Marriage_Exception 
{ 
	public static void main(String[] args) throws TooYoungException, TooOldException   
	{
	int age=65;
	if(age>60)
	{
	throw new TooOldException("age is already crossed the marriage age");
	}
	else if(age<18)
	{
	throw new TooYoungException("it is not the age of marriage as per indian constitution");
	}
	else 
	{
		System.out.println("we will try to fix Match for you");
	}
	}

}
