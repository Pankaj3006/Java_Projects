package Basic_Concepts;

public class Student extends Person {
	int marks;
    int age;
    Student(String name, int roll, int age, int marks)
    {
    	super(name,roll);
    	this.age=age;
    	this.marks=marks;
    	System.out.println(this.hashCode());
    }
	public static void main(String[] args)
	{
	Student s1= new Student("Gupta",102,40,97);	 
	System.out.println(s1.name);
	System.out.println(s1.roll);
	System.out.println(s1.age);
	System.out.println(s1.marks);
	System.out.println(s1.hashCode());
		System.out.println(s1.getClass().getName());
	}

}
