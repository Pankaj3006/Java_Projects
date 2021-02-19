package Practice_Package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Traversing_Hashmap
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("Java", 40);
		hs.put("Selenium", 30);
		hs.put("TestNG", 20);
		hs.put("Cucumber", 10);
		hs.put("Framework", 100);
		System.out.println(hs);
		
		Iterator<Entry<String, Integer>> itr = hs.entrySet().iterator();
		while(itr.hasNext())
		{
//			Entry<String, Integer> MapElement = (Entry<String, Integer>) itr.next();
//			System.out.println(MapElement.getKey()+"--->"+MapElement.getValue());
			System.out.println(itr.next());
		}

	}

}
