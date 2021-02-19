package Array_Concepts;

import java.util.Scanner;
public class Element_Right_Rotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Positions with which It Needs to Rotate in Right Direction");
		int n = in.nextInt();
		int[] arr = new int[] { 12, 34, 45, 76, 84, 112, 234, 453, 23, 89, 57};
		System.out.println("Number of Elements Present in the array is: " + arr.length);
		int number_of_Right_Rotations = n % arr.length;
		System.out.println("Array Rotate in Right Direction");
		for (int i = arr.length-number_of_Right_Rotations-1; i >=0; i--)
		{
			System.out.print(arr[i] + "  ");
		}
		for (int j = arr.length-1; j >= arr.length- number_of_Right_Rotations; j--) {
			System.out.print(arr[j] + "  ");
		}
		in.close();
	}
}
