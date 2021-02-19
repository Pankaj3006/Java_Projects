package Array_Concepts;

public class Reverse_Even_Odd_Position {

	public static void main(String[] args) {
	int[] arr= new int[] {12, 34, 45, 76, 84, 112, 234, 453, 23, 89, 57};
	System.out.println("Number of Elements Present in the array is: "+ arr.length);
	System.out.println("//Array in Reverse Order");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+ "  ");
	}
	System.out.println();
	System.out.println("//Array Elements on Even position");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2!=0)
			System.out.print(arr[i]+"  ");
		else
			continue;
	}
	System.out.println();
	System.out.println("//Array Elements on Odd position");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
			System.out.print(arr[i]+"  ");
		else
			continue;
	}

	}

}
