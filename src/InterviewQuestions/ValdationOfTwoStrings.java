package InterviewQuestions;

import java.util.HashSet;

public class ValdationOfTwoStrings
{
	public static void main(String[] args) 
	{
	String s1="adefg";
	String s2="dgefghmp";
	String s3="adeghmplfp";
	char[] ch1 = s1.toCharArray();
	char[] ch2 = s2.toCharArray();
	char[] ch3 = s3.toCharArray();
	HashSet<Character> hs= new HashSet<Character>();
	HashSet<Character> hs1= new HashSet<Character>();
	for(char x: ch1)
	{
		hs.add(x);
	}
	for(char x: ch2)
	{
		hs.add(x);
	}
	System.out.println("The Characters present in S1 & S2 are: "+hs);
	for(char x: ch3)
	{
		hs1.add(x);
	}
	System.out.println("The Characters present in S3 are: "+hs1);
	
	if(hs1.containsAll(hs))
	System.out.println("S3 contains all characters of S1 & S2");
	else
	System.out.println("S3 does not contain all characters of S1 & S2");
	}
	

}
