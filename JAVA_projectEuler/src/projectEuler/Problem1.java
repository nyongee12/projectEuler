package projectEuler;

public class Problem1 {
	
	static public void main(String args[])
	{
		int num = 0;
		for( int i = 1 ; i < 1000 ; i++ )
			if ( i%3==0 || i%5==0 ) num += i;
		System.out.println(num);
	}
}