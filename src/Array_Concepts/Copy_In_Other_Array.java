package Array_Concepts;

public class Copy_In_Other_Array {

	public static void main(String[] args) {
		int[] arr1 = {23, 45, 56, 75, 112, 34};
		System.out.println("The Length of Original Array is: "+ arr1.length);
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length;i++)
		{
			arr2[i]=arr1[i];
		}
		for(int i=0; i<arr2.length;i++)
		{
			System.out.println(arr2[i]);;
		}
	}
}
