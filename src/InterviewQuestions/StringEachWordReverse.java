package InterviewQuestions;

public class StringEachWordReverse 
{
    public static void main(String[] args)
	{
		// input is my name is pankaj
		// output will be ym eman si jaknap
		String str = "my name is pankaj gupta";
		String[] ew = str.split("\\s");
		for (int i = 0; i < ew.length; i++) 
		{
			System.out.print(rev_str(ew[i]) + " ");
		}

	}

	public static String rev_str(String s) 
	{
		String rev = "";
		char[] ch = s.toCharArray();
		for (int j = ch.length - 1; j >= 0; j--)
		{
			rev = rev + ch[j];
		}
		return rev;
	}

}
