package projectEuler;

public class Problem17 {
	
	static final int[] one = {3, 3, 5, 4, 4, 3, 5, 5, 4};
	static final int[] ten = {6, 6, 8, 8, 7, 7, 9, 8, 8};
	static final int[] tens = {3, 6, 6, 5, 5, 5, 7, 6, 6};
	static final int hundred = 7;
	static final int thousand = 8;
	static final int and = 3;
	
	
	public static int getLength(int num)
	{
		int sum = 0;
		if( num == 1000 ) return thousand+one[0];
		if( num/100 != 0 )
		{
			sum += (one[(num/100)-1]+hundred);
			num %= 100;
			if( num != 0 ) sum += and;
		}
		if( num > 10 && num < 20 )
			return sum+ten[num-10-1];
		if( num/10 != 0 ) sum += tens[num/10-1];
		if( num%10 != 0 ) sum += one[num%10-1];
		return sum;
	}
	public static void main(String args[])
	{
		int sum = 0;
		for( int i = 1 ; i <= 1000 ; i++ )
			sum += getLength(i);
		System.out.println(sum);
	}

}
