package QAClick_Package;

public class _35_n_nPlus1_by_2_Pattern_of_Array 
{
	public static void main(String[] args) 
	{
		int num = 5;
		int[] arr = new int[num * (num + 1) / 2];
		int k=0;
		for (int i = 1; i <= num; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{ 
				arr[k++]=j;
			}		
		}
		for (int l = 0; l < arr.length; l++)
		{
			System.out.print(arr[l] + " ");
		}
	}
}
