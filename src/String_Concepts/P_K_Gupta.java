package String_Concepts;

import java.util.Scanner;

public class P_K_Gupta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String which needs to convert in Required Format");
		String str = in.nextLine();
		String Req_Format = "";
		String arr[] = str.split("\\s");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i!=arr.length-1)
			{
			String First_Letter = arr[i].substring(0,1);
			Req_Format = Req_Format+First_Letter.toUpperCase()+". ";
			}
			else
			{
				Req_Format = Req_Format + arr[i];
			}
		}
		System.out.println(Req_Format);
		in.close();
	}
}
