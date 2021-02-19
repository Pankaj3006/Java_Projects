package Array_Concepts;

import java.util.Scanner;

public class Element_Left_Rotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Positions with which it needs to rotate in Left Direction");
		int n = in.nextInt();
		int[] arr = new int[] { 12, 34, 45, 76, 84, 112, 234, 453, 23, 89, 57 };
		System.out.println("Number of Elements Present in the array is: " + arr.length);
		int number_of_Left_Rotations = n % arr.length;
		System.out.println("Array Rotate in Left Direction");
		for (int i = number_of_Left_Rotations; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		for (int j = 0; j < number_of_Left_Rotations; j++) {
			System.out.print(arr[j] + "  ");
		}
		in.close();
	}

}
