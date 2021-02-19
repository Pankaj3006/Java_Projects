package String_Concepts;

import java.util.Scanner;

public class Toggle_Each_Letter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String needs to be Toggled");
		String str = in.nextLine();
		String Toggled_Word="";
		String arr[]=str.split("\\s");
		for(int i=0;i<=arr.length-1;i++)
		{
		String First_Letter= arr[i].substring(0,1);
		String Rem_Word= arr[i].substring(1);
		Toggled_Word=Toggled_Word+First_Letter.toLowerCase()+Rem_Word.toUpperCase()+" ";
		}
		System.out.println(Toggled_Word);
		in.close();

	}

}
