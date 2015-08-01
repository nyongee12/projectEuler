package projectEuler;

public class Problem9 {
	
	public static void main(String args[])
	{
		boolean flag = false;

		for(int a = 1 ; a < 333 && !flag ; a++)
			for(int b = a+1 ; b < (1000-a)/2 && !flag ; b++)
			{
				int c = 1000-(a+b);
				if( Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2) )
				{
					System.out.println(a*b*c);
					flag = true;
				}
			}
	}

}
