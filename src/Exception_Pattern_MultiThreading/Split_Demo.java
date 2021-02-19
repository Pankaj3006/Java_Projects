package Exception_Pattern_MultiThreading;

import java.util.Scanner;

public class Split_Demo 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be Reverse by Words");
		String str = in.nextLine();
		int count=0;
		String arr[] = str.split("\\v");
		for (int i = 0; i < arr.length; i++) 
		{
		System.out.println(arr[i]);
		count++;
		}
		System.out.println("The length of Array is: "+ count);
		in.close();
	}
}
//("\\:") --> 19:23:45 will break into 3 parts with respect to ':'
//("\\-") --> 19-02-2020 will break into 3 parts with respect to '-'
//("\\.") --> www.durga.soft.com will break into 4 parts with respect to '.'
//("\\d") --> Pankaj1Kumar2Gupta will break into 3 parts with respect to 'Digits'
//("\\,") --> 1,00,000,0000 will break into 4 parts with respect to ','