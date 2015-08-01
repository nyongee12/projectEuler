package projectEuler;

public class Problem12 {
	
	public static int makeNum(int num)
	{
		int sum = 2;
		int num_sqrt = (int)Math.sqrt(num);
		for( int i = 2 ; i <= num_sqrt ; i++ )
			if( num%i == 0 ) sum += 2;
		if( num_sqrt*num_sqrt == num ) sum--;
		return sum;
	}
	
	public static void main(String args[])
	{
		int num;
		for( int i = 1 ; ; i++ )
		{
			num = i*(i+1)/2;			
			if( makeNum(num) >= 500 ) break;
		}
		
		System.out.println(num);
		
	}

}
