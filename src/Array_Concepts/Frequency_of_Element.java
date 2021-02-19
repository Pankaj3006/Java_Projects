package Array_Concepts;

public class Frequency_of_Element {

	public static void main(String[] args) {
		int[] arr = {6, 2, 1, 3, 2, 4, 5, 3, 5, 2, 2, 2};
		int[] count = new int[arr.length];
		int repeat=-1;
		for(int i=0; i<arr.length; i++)
		{
			int freq=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
				freq++;
				count[j]=repeat;
				}
			}
			if(count[i] != repeat)
			{
				count[i] = freq;
			}
		}
		for(int j=0; j<count.length; j++)
		{
			if(count[j]!=repeat)
			System.out.println(arr[j]+" | "+count[j]+" times ");
		}
//		System.out.println();	
//	    for(int i=0; i<count.length; i++)
//	    {
//	    	count[arr[i]]++;
//	    }
//	    for(int i=0; i<count.length; i++)
//	    {
//	    	if(count[i]>0)
//	    		System.out.println(i+" | "+count[i]+" times ");
//	    } 
	}
}