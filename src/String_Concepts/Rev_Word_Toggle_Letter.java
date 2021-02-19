package String_Concepts;

import java.util.Scanner;

public class Rev_Word_Toggle_Letter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String for which words needs to reverse and Toggle");
		String str = in.nextLine();
		String Rev_Word="";
		String arr[]= str.split("\\s");
		for(int i=0;i<=arr.length-1;i++)
		{
			StringBuffer sb= new StringBuffer(arr[i]);
			sb.reverse();
			String First_letter=sb.substring(0, 1);
			String Rem_Word=sb.substring(1);
			Rev_Word=Rev_Word+First_letter.toLowerCase()+Rem_Word.toUpperCase()+" ";
		}
		System.out.println(Rev_Word);
		in.close();
		}
}
