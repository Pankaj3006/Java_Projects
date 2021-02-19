package Practice_Package;

public class Frequency_Letter 
{
	public static void main(String[] args)
	{
		String str = "test";
		char[] ch = str.toCharArray();
		int[] freq = new int[ch.length];
		int repeat = -1;
		for (int i = 0; i < ch.length; i++)
		{
			int count = 1;
			for (int j = i + 1; j < ch.length; j++)
			{
				if (ch[i] == ch[j])
				{
					count++;
					freq[j] = repeat;
				}
			}
			if (freq[i] != repeat)
				freq[i] = count;
		}
		for (int k = 0; k < freq.length; k++)
		{
			if (freq[k] != repeat)
				System.out.println(ch[k] + "--->" + freq[k]);
		}
	}
}
