package Array_Concepts;

public class Operations_On_Array
{
	public static void main(String[] args) 
	{
		int[] arr = {2, 1, 3, 2, 4, 5, 3, 5, 5,4,4};
		int[] freq_arr = new int[arr.length];
		int visited = -1;
		for(int i=0; i<arr.length; i++)
		{
			int count =1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq_arr[j]=visited;
				}
			}
			if(freq_arr[i] != visited)
			{
				freq_arr[i]=count;
			}
		}
		for(int i=0; i<freq_arr.length; i++)
		{
			//if(freq_arr[i] != visited)
			if(freq_arr[i] >1)
			System.out.println(" "+arr[i]+" | "+freq_arr[i]);
		}
	}
}
