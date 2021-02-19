package String_Concepts;

import java.util.Scanner;

public class Rev_Str_Toggle_Letter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String needs to be Reverse Toggled");
		String str = in.nextLine();
		String Rev_Word="";
		char ch[]=str.toCharArray();
        for(int j=ch.length-1;j>=0;j--)
        {
        	Rev_Word=Rev_Word+ch[j];
        }
        System.out.println(Rev_Word);
		
		String Rev_toggle="";
	    String arr[]=Rev_Word.split("\\s");
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	String first_letter = arr[i].substring(0,1);
	    	String Rem_Word= arr[i].substring(1);
	    	Rev_toggle=Rev_toggle+first_letter.toLowerCase()+Rem_Word.toUpperCase()+" ";
	    }
        System.out.println(Rev_toggle);
        in.close();
	}

}
