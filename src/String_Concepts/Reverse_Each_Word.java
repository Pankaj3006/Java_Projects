package String_Concepts;

import java.util.Scanner;

public class Reverse_Each_Word 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String for which words needs to reverse");
		String str = in.nextLine();
		String arr[] = str.split("\\s");
		//System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print(rev_str(arr[i])+" ");
		}
		in.close();
	}
	
	public static String rev_str(String s)
	{
		 String Rev_Word="";
		char ch[]=s.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			Rev_Word=Rev_Word+ch[j];
		}
	return Rev_Word;
	}
}

//StringBuffer sb= new StringBuffer(arr[i]);
//sb.reverse();
//Rev_Word=Rev_Word+sb+" ";
	
