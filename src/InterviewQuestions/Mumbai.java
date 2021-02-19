package InterviewQuestions;

public class Mumbai {

	public static void main(String[] args) {
		String str = "Mumbai";
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<=ch.length; j++)
			{
				System.out.println(str.substring(i,j));
			}
		}

	}

}
