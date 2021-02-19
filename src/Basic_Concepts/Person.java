package Basic_Concepts;

public class Person 
{
        String name;
        int roll;
	
	public Person(String name, int roll) 
	{
		this.name=name;
		this.roll=roll;
		System.out.println(this.hashCode());
		}

	public static void main(String[] args)
	{
	Person p1= new Person("pankaj",101);	 
	System.out.println(p1.name);
	System.out.println(p1.roll);
	
	
	}
 }
