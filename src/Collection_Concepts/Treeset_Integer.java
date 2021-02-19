package Collection_Concepts;

import java.util.TreeSet;

public class Treeset_Integer 
{ 
    public static void main(String[] args) 
    { 
     @SuppressWarnings("unchecked")
	TreeSet<Integer> t= new TreeSet<Integer>(new MyComparator());
     //TreeSet t= new TreeSet();
     t.add(20);
     t.add(10);
     t.add(5);
     t.add(0);
     t.add(15);
     System.out.println(t);
         } 
} 