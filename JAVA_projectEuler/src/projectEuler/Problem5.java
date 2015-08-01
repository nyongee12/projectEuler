package projectEuler;

public class Problem5 {
	
	static public void main(String args[])
	{
		int i = 22;
		for( ; ; i+=2 )
		{
			int j = 1;
			for( ; j < 21 ; j++ )
				if( i%j != 0 ) break;
			if( j == 21 ) break;
		}
		
		System.out.println(i);
		
		
	}

}
