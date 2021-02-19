package ReflectionAPI_Example;

import java.lang.reflect.Method;

public class Methods_Number 
{
	public static void main(String[] args)
	{		
		char ch='a';
		Character s = new Character(ch);
		System.out.println(s);
		String name= s.getClass().getName();
		System.out.println(name);
		Class<? extends Character> c= s.getClass();
		int count=0;
		Method[] No_of_Methods=c.getDeclaredMethods();
		for (@SuppressWarnings("unused") Method m1: No_of_Methods)
		{
			count++;
			//System.out.println(m1);
		}
		System.out.println("Total Number of Methods are:"+count);
	}
}
