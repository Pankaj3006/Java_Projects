package QAClick_Package;

public class _37_Rearrange_An_Array 
{
	public static void main(String[] args)
	{
		int[] arr = {3, 2, 3, 5, 2, 4, 8, 7, 9, 12, 4, 17, 28, 4, 45};
		System.out.println("The length of Array is: " + arr.length);
		int j=-1, temp;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				j++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}
	}
}
