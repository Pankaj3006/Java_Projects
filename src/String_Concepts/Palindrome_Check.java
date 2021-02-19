package String_Concepts;

import java.util.Scanner;

public class Palindrome_Check {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to be Reverse");
		String str = in.nextLine();
		char ch[]=str.toCharArray();
		String rev_str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev_str=rev_str+ch[i];
		}
		System.out.println(rev_str);
		if(rev_str.equalsIgnoreCase(str))
		System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		in.close();
	}
}
