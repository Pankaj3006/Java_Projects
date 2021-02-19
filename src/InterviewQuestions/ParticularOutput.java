package InterviewQuestions;

public class ParticularOutput
{
	public static void main(String[] args) 
	{
		// write 01010101
		// output should be 00001111
		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1};
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0) 
			{
				System.out.print(arr[i]);
			}

		}
		for (int i = 0; i < arr.length; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.print(arr[i]);
			}
		}

	}

}
