package QAClick_Package;

public class _39_Count_Special_Character
{
	public static void main(String[] args) 
	{
		char[] arr = {'1', 'a', 'e', 'i', 'o', 'u', 'q', 'w', 'e', '<', '$', '#', '2'};
		int digits=0;
		int alphabets=0;
		int other_characters=0;
		for(int i=0; i<arr.length; i++)
		{
			if(Character.isAlphabetic(arr[i]))
			{
				alphabets++;
				System.out.print(arr[i]+" ");
			}
			else if(Character.isDigit(arr[i]))
			{  
				digits++;
				System.out.print(arr[i]+ " ");
			}
			else
			{
				other_characters++;
				System.out.print(arr[i]+ " ");
			}
				
		}
		System.out.println("The Number of Alphabets are: "+alphabets);
		System.out.println("The Number of Digits are: "+digits);
		System.out.println("The Number of special Characters are: "+other_characters);

	}

}
