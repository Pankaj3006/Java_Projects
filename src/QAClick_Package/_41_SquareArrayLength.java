package QAClick_Package;

public class _41_SquareArrayLength
{
	public static void main(String[] args)
	{
		int n = 3;
		int[] arr = new int[n * n];
		int k=0;
		for(int i=0; i<n; i++)
		{
			for(int j=n; j>0; j--)
			{
				arr[k++]=i*j;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
 // 0,0,1 ,   0,2,1,   3,2,1