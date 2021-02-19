package Array_Concepts;

public class Smallest_Element {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 6, 75, 2, 34 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
			    min=arr[i];
			}
		}
		System.out.println("the Smallest element present in the Array is: " + min);

	}

}
