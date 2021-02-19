package Practice_Package;

public class Frequency_Word 
{
	public static void main(String[] args) 
	{
		String str = "My Name is Pankaj Gupta My first name is Pankaj My Last Name is Gupta";
		String[] word = str.split("\\s");
		int[] freq = new int[word.length];
		int Repeat = -1;
		for (int i = 0; i < word.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < word.length; j++) 
			{
				if (word[i].equalsIgnoreCase(word[j])) 
				{
					count++;
					freq[j] = Repeat;
				}
			}
			if (freq[i] != Repeat)
			{
				freq[i] = count;
			}
		}

		for (int i = 0; i < word.length; i++)
		{
			if (freq[i] != Repeat)
				System.out.println(word[i] + " ---- " + freq[i]);
			//	System.out.print(word[i] + " , ");
		}
	}
}
