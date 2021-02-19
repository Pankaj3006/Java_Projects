package Collection_Concepts;

import java.util.*;

public class Treeset_StringBuffer {

	public static void main(String[] args) {
	TreeSet<String> t= new TreeSet<String>();
    t.add(new StringBuffer("Pankaj").toString());
    t.add(new StringBuffer("Pooja").toString());
    t.add(new StringBuffer("Pradeep").toString());
    t.add(new StringBuffer("Gunjan").toString());
    Iterator<String>  itr = t.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
	System.out.println(t);
	}
}
