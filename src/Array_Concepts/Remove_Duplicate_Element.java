package Array_Concepts;

import java.util.*;


public class Remove_Duplicate_Element 
{
	public static void main(String[] args)
	{
		int[] arr = {6, 2, 1, 3, 2, 4, 5, 3, 5, 2, 2, 2};
		//Set<Integer> s= new HashSet<Integer>();
		Set<Integer> s= new LinkedHashSet<Integer>();	
		for(int x: arr)
		{
			s.add(x);
		}
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}