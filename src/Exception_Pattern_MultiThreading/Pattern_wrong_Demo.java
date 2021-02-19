package Exception_Pattern_MultiThreading;

import java.util.Scanner;
import java.util.regex.*;

public class Pattern_wrong_Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be Reverse by Words");
		String str = in.nextLine();
		Pattern p = Pattern.compile("[6-9][\\d]{9}]");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("phone number is valid");
		}
		else
		{
			System.out.println("phon number is invalid");
		}
		in.close();
	}
}
