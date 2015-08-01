package projectEuler;

import java.util.Scanner;

public class Problem11 {
	
	static int[][] num = new int[20][20];
	
	public static int verticalNum(int cidx, int ridx)
	{
		int mul=1;
		for( int i = 0 ; i < 4 ; i++ )
			mul *= num[cidx+i][ridx];
		return mul;
	}
	
	public static int horizontalNum(int cidx, int ridx)
	{
		int mul=1;
		for( int j = 0 ; j < 4 ; j++ )
			mul *= num[cidx][ridx+j];
		return mul;
	}
	
	public static int diagonalRightNum(int cidx, int ridx)
	{
		int mul=1;
		for( int k = 0 ; k < 4 ; k++ )
			mul *= num[cidx+k][ridx+k];
		return mul;
	}
	
	public static int diagonalLeftNum(int cidx, int ridx)
	{
		int mul=1;
		for( int k = 0 ; k < 4 ; k++ )
			mul *= num[cidx+k][ridx-k];
		return mul;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < 20 ; i++)
			for(int j = 0 ; j < 20 ; j++ )
				num[i][j] = in.nextInt();
		
		int max = 0;
		
		// VERTICAL
		for( int i = 0 ; i < 17 ; i++ )
			for( int j = 0 ; j < 20 ; j++ )
			{
				int num = verticalNum(i,j);
				if( max < num ) max = num;
			}
		// HORIZONTAL
		for( int i = 0 ; i < 20 ; i++ )
			for( int j = 0 ; j < 17 ; j++ )
			{
				int num = horizontalNum(i,j);
				if( max < num ) max = num;
			}
		// DIAGONAL RIGHT
		for( int i = 0 ; i < 17 ; i++ )
			for( int j = 0 ; j < 17 ; j++ )
			{
				int num = diagonalRightNum(i,j);
				if( max < num ) max = num;
			}
		// DIAGONAL LEFT
		for( int i = 0 ; i < 17 ; i++ )
			for( int j = 3 ; j < 20 ; j++ )
			{
				int num = diagonalLeftNum(i,j);
				if( max < num ) max = num;
			}
		
		System.out.println(max);
		
	}
	

}
