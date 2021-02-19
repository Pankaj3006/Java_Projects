package Array_Concepts;

public class Largest_Element {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 56, 75, 112, 34 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
			    max=arr[i];
			}
		}
		System.out.println("the Largest element present in the Array is: " + max);
	}
}
