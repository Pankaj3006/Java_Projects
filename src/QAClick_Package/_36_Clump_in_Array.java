package QAClick_Package;
// A clump in an array is a series of 2 or more adjacent Elements of the same value 
public class _36_Clump_in_Array 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,2,2,3,3,3,3,3,4,4,5,5,7,7,7};
		int count=0, temp=-1;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1] && arr[i]!=temp)
			{
				count++;
				temp=arr[i];
			}
		}
		System.out.println(count);
	}
}
