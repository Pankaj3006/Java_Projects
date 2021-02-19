
package Array_Concepts;

public class Ascending_Sorting {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 56, 75, 112, 34 };
		int temp = 0;
		int p=0;
		System.out.println("The Original Array Elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The Sorted Array Elements are: ");
		for (p= 0; p < arr.length; p++) {
			System.out.print(arr[p] + "  ");
		}
		System.out.println();
		System.out.println("The Largest Elemetnt is: " + arr[p-1]);
		System.out.println("The 2nd Largest Elemetnt is: " + arr[p-2]);
		System.out.println("The 3rd Largest Elemetnt is: " + arr[p-3]);

	}

}
