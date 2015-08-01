package projectEuler;

public class Problem7 {
	static boolean isPrime(long num)
	{
		for( long i = 2 ; i <= Math.sqrt(num) ; i++ )
			if( num%i == 0 ) return false;
		return true;
	}
	
	static public void main(String args[])
	{
		int num = 1;
		for(int i = 3 ; num != 10001; i+=2)
			if( isPrime(i) )
			{
				if( num == 10000) System.out.println(i);
				num++;
			}
	}

}
