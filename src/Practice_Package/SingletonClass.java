package Practice_Package;

public class SingletonClass 
{
	private static SingletonClass single_instance = null;
	public String s;

	private SingletonClass()
	{
		s = "Hello I am the responsible for creation of Singleton Class.";
	}

	public static SingletonClass getinstance() 
	{
		if (single_instance == null) 
		{
			single_instance = new SingletonClass();
		}
		return single_instance;
	}

	public static void main(String[] args)
	{
		SingletonClass x = SingletonClass.getinstance();
		SingletonClass y = SingletonClass.getinstance();
		SingletonClass z = SingletonClass.getinstance();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
	}
}
