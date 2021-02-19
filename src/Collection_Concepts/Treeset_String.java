package Collection_Concepts;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_String {

	public static void main(String[] args) {
	TreeSet<String> t= new TreeSet<String>();
     t.add(new String("Pankaj"));
     t.add(new String("Pooja"));
     t.add(new String("Pradeep"));
     t.add(new String("Gunjan"));
    Iterator<String>  itr = t.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
	//System.out.println(t);
	}
	}

