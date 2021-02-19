package Collection_Concepts;

public class HashCode {
	String name;
	int age;

	HashCode(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int hashCode()
	{
		return age;
	}

	public String toString()
	{
		return name + "@" + Integer.toHexString(hashCode());
	}

	public static void main(String[] args)
	{
		HashCode s1 = new HashCode("Pankaj", 1001);
		HashCode s2 = new HashCode("Gunjan", 2001);
		System.out.println(s1);
		System.out.println(s2);
	}
}
