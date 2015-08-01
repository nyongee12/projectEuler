package projectEuler;

public class Problem3 {
	static boolean isPrime(long num)
	{
		for( long i = 2 ; i <= Math.sqrt(num) ; i++ )
			if( num%i == 0 ) return false;
		return true;
	}
	
	static public void main(String args[])
	{
		long i = 0;
		System.out.println("Start");
		for( i = (long)Math.sqrt(600851475143L) ; i > 1 ; i-- )
		{
			if( i%2 == 0 ) continue;
			if( 600851475143L%i == 0 && isPrime(i) ) break;
		}
		System.out.println(i);
	}

}
