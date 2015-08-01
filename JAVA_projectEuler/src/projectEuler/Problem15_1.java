package projectEuler;

public class Problem15_1 {
	
	static long[][] count = new long[21][21];
	
	public static long getCount(int cidx, int ridx)
	{
		if( cidx == 0 || ridx == 0 ) return 1;
		return getCount(cidx-1, ridx)+getCount(cidx, ridx-1);
	}
	
	public static void main(String args[])
	{
		System.out.println(getCount(20, 20));
	}
}