package projectEuler;

public class Problem14_2 {
	
	static final int bound = 1000000;

	public static void main(String args[])
	{
		long max = 0;
		int max_count = 0;
		for(long i = bound ; i > 1 ; i-- )
		{
			int count = 1;
			long num = i;
			while(num != 1)
			{
				if( num%2 == 0 ) num /= 2;
				else num = 3*num+1;
				count++;
			}
			if( max_count < count )
			{
				max_count = count;
				max = i;
			}
		}
		System.out.println("num : "+max+" count : "+max_count);
	}

}
