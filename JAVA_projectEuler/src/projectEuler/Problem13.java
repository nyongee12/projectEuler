package projectEuler;

import java.util.Scanner;

public class Problem13 {
	static int[] num = new int[60];
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		for( int i = 0 ; i < 100 ; i++ )
		{
			String str = in.next();
			for( int j = 59 ; j >= 10 ; j-- )
				num[j] += (str.charAt(j-10)-'0');
		}
		
		for( int i = 59 ; i >= 1 ; i-- )
		{
			num[i-1] += (num[i]/10);
			num[i] %= 10;
		}
		
		int i;
		for( i = 0 ; ; i++ )
			if( num[i] != 0 ) break;
		
		for( int k = i ; k < i+10 ; k++ )
			System.out.print(num[k]);
		
		System.out.println("");
		
	}

}
