package InterviewQuestions;

public class Star_Pattern
{
	public static void main(String[] args) 
	{
		int no = 5;
		for (int i = 1; i <= no; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
