package String_Concepts;

import java.util.Scanner;

public class Capitalize_First_Word {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String needs to be Capitilize");
		String str = in.nextLine();
		String Capitilize_word="";
		String arr[]=str.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			String first_letter= arr[i].substring(0,1);
			String Rem_Word= arr[i].substring(1);
			Capitilize_word=Capitilize_word+first_letter.toUpperCase()+Rem_Word+" ";
		}
		System.out.println(Capitilize_word);
		in.close();
	}
}
