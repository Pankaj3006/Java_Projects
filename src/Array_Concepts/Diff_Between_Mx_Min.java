package Array_Concepts;

public class Diff_Between_Mx_Min {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 34, 45, 76, 84, 112, 234, 453, -2, 89, 57 };
		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
				max = arr[i];
			
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max - min);
	}
}
