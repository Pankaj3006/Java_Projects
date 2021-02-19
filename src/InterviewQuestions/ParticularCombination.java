package InterviewQuestions;


public class ParticularCombination {

	public static void main(String[] args) 
	{
	int[] arr1= {1,2,6,4,8,3,5,4};
	int count =0;
	for(int i=0; i<arr1.length; i++)
	{
		for(int j=i+1; j<arr1.length; j++)
		{
			if(arr1[i]+arr1[j]==5)
			{
				System.out.println("The sum of Element value "+arr1[i]+" at "+i+" position and The sum of Element value "+arr1[j]+" at "+j+" position is 5");
				count++;
			}
		}
	}
	System.out.println("The total number of Combination is: "+count);
	}
}
