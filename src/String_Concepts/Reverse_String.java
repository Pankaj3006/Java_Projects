package String_Concepts;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String to be Reverse");
		String str = input.nextLine();
		//String str="Pankaj Gupta";
		char ch[] =  str.toCharArray();
		String rev_str="";
		for (int i=ch.length-1;i>=0;i--)
		{
			rev_str=rev_str+ch[i];
		}
		System.out.println(rev_str);
        input.close();
	}

}
