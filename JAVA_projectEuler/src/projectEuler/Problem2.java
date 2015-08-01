package projectEuler;

public class Problem2 {
	public static int fibonacci(int num)
	{
		if ( num == 1 ) return 1;
		int prev = 1, pprev = 1;

		for( int i = 1 ; i < num ; i++ )
		{
			int tmp = prev;
			prev += pprev;
			pprev = tmp;
		}
		return prev;
	}
	
	static public void main(String args[])
	{
		int sum = 0;
		System.out.println("start");
		sum = 0;
		for(int i = 0 ; ; i++)
		{
			int num = fibonacci(i);
			if( num > 4000000 ) break;
			if( num%2 == 0 ) sum += num;
		}
		System.out.println("result = " + sum);
	}

}
