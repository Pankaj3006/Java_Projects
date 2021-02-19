package QAClick_Package;

public class _40_RemoveDuplicates_IncreasingOrder 
{
	public static void main(String[] args)
	{
		int[] arr = {13, 1, 3, 3, 4, 4, 9, 12, 4, 2, 5, 2, 2, 6, 1, 6, 3, 4, 4, 2, 3, 7, 7};
		int[] freq_arr = new int[arr.length];
		int repeat = -1;
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
		for(int j=i+1; j< freq_arr.length; j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
					freq_arr[j] = repeat;
				}
			}
			if (freq_arr[i] != repeat)
			{
				freq_arr[i] = count;
			}
		}
		for (int i = 0; i < freq_arr.length; i++) 
		{
			if (freq_arr[i] != repeat)
			{
				System.out.print(arr[i] + " ");
			}
			
		}
		
	}
}
