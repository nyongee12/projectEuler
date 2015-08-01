package projectEuler;

public class Problem15_2 {
	
	static long[][] count = new long[21][21];
	
	public static void makeCount()
	{
		for( int i = 0 ; i < 21 ; i++ )
			for( int j = 0 ; j < 21 ; j++ )
			{
				if( i == 0 || j == 0 ) count[i][j] = 1;
				else count[i][j] = count[i-1][j] + count[i][j-1];
			}
	}
	
	public static void main(String args[])
	{
		makeCount();
		System.out.println(count[20][20]);
	}

}
