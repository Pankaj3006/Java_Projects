package QAClick_Package;

public class Important_Unsolved {
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'a', 'a', 'c', 'd', 'b', 'a', 'c', 'd', 'a', 'b', 'c' };
		//char[] ch = {'a', 'a', 'a', 'a', 'c','c','c','c','c','c'};
		int[] freq_arr = new int[ch.length];
		int repeat = -1;
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < ch.length; j++)
			{
				if(ch[i] == ch[j]) 
				{
					count++;
					if(count%2!=0)
						ch[j]= Character.toLowerCase(ch[j]);
					else
						ch[j]= Character.toUpperCase(ch[j]);
					freq_arr[j]=repeat;
				}
				
			}
		if (freq_arr[i] != repeat)
				freq_arr[i] = count;
		}
		for(int i=0; i<freq_arr.length; i++)
		{
      		//if(freq_arr[i] >= 1)
					
			System.out.print(ch[i]+" ");
			
		}
	}
}
