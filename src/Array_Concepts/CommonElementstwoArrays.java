package Array_Concepts;


public class CommonElementstwoArrays {

	public static void main(String[] args) 
	{
	int[] arr1= {2,5,3,7};
	int[] arr2 = {5,2,9,0,1};
	for(int i=0; i<arr1.length; i++)
	{
		for(int j=0; j<arr2.length; j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
			}
		}
	}
	}
}
