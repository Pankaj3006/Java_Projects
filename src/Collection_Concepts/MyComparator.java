package Collection_Concepts;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
	//String I1= (String)o1;
	//String I2= (String)o2;
	String I1= o1.toString();
	String I2= o2.toString();
	Integer l1= I1.length();
	Integer l2= I2.length();
	return (l1>l2)?+1:-1;
	//return I1.compareTo(I2);
	//return I2.compareTo(I1);
	}

}
