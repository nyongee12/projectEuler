package projectEuler;

import java.util.ArrayList;

public class Problem16 {
	
	static ArrayList<Integer>[] total = (ArrayList<Integer>[]) new ArrayList<?>[1000];

	public static void main(String args[])
	{	
		for(int i = 0 ; i < 1000 ; i++ )
			total[i] = new ArrayList<Integer>();
		
		for( int i = 0 ; i < 1000 ; i++ )
		{
			total[i].add(2);
			if( i == 0 ) continue;
			total[i].set(0, (2*total[i-1].get(0))%10);
		}
		
		int idx = 1;
		while(true)
		{
			for(int i = 0 ; i < 1000 ; i++ )
				total[i].add(0);
			
			for( int i = 0 ; i < 1000 ; i++ )
			{
				if( i == 0 ) continue;
				if( 2*total[i-1].get(idx-1) < 10 )
					total[i].set(idx, (2*total[i-1].get(idx))%10);
				else
					total[i].set(idx, (2*total[i-1].get(idx)+1)%10);
			}

			int k = 0;
			for( ; k < 1000 ; k++ )
				if( total[k].get(idx) != 0) break;
			if( k == 1000 ) break;
			
			idx++;
		}
		
		int sum = 0;
		for(int i = 0 ; i < idx ; i++ )
			sum += total[999].get(i);

		System.out.println(sum);
	}
}
