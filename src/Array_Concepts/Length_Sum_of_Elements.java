package Array_Concepts;

public class Length_Sum_of_Elements {
	public static void main(String[] args) {
		int[] arr = new int[] { 12, 34, 45, 7, 8, 6, 7, 12, 34, 3, 2, 9, 7, 6, 7 };
		System.out.println("Number of Elements Present in the array is: " + arr.length);
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i - 1] == 6 & arr[i] == 7) 
			{
				sum = sum - arr[i - 1];
			} 
			else
			{
				sum = sum + arr[i];
			}

			// sum = sum + arr[i];
		}
		System.out.println("The sum of all Elements are: " + sum);
	}
}
