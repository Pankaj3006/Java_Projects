package Array_Concepts;

public class Element_With_Max_Frequency 
{
	public static void main(String[] args)
	{
		int[] arr = {2, 1, 3, 2, 4, 5, 3, 5, 2, 2, 2};
		int[] count = new int[arr.length];
		int most=0;
		int mostvalue=0;
	    for(int i=0; i<count.length; i++)
	    {
	    	count[arr[i]]++;
	    }
	    for (int i=0; i<count.length; i++)
	    {
	    	if(count[arr[i]]>most)
	    	{
	    		most=count[arr[i]];
	    		mostvalue = arr[i];
	    	}
	    }
	    System.out.println("Element with Maximum Frequency is: "+ mostvalue + " and Frequency is: "+ most);
	}
}
