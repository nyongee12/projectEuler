package projectEuler;

import java.util.Scanner;

public class Problem18 {
	
	static final int line = 15;
	static int[][] triangle = new int[line][];
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < line ; i++)
		{
			triangle[i] = new int[i+1];
			for(int j = 0 ; j < i+1 ; j++ )
				triangle[i][j] = in.nextInt();
		}
		
		for( int i = line-2 ; i >= 0 ; i-- )
			for( int j = 0 ; j < i+1 ; j++ )
				triangle[i][j] += 
				Math.max(triangle[i+1][j], triangle[i+1][j+1]);
		
		System.out.println(triangle[0][0]);
	}

}
