package QAClick_Package;

public class _38_NonRepeateditems 
{
	public static void main(String[] args) 
	{
		int[] a = { 8, 1, 1, 8, 9, 9 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;
			for (int j = 0; j < a.length; j++)
			{
				if (a[i] == a[j] && i != j)
				{
					count++;
				}
			}
			if (count == 1) 
			{
				System.out.print(a[i] + " ");
				temp = 1;
			}
		}
		if (temp == 0)
			System.out.println("No Unique item");
	}
}
