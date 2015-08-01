package projectEuler;

import java.util.Scanner;

public class Problem8 {
	
	static String a = new String("");
	
	public static int makeNum(int idx)
	{
		int mul=1;
		for(int i = idx ; i < idx+5 ; i++)
			mul *= a.charAt(i)-'0';
		return mul;
	}
	
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < 20 ; i++)
			a += in.next();
		
		int max = 0;
		int k = 0;
		for(int i = 0 ; i < a.length()-4 ; i++)
		{
			int mul = makeNum(i);
			if( mul > max )
				max = mul;
		}
		System.out.println("max : "+max);
	}

}
