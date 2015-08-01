package projectEuler;

public class Problem4 {
	
	static boolean isPalindrome(int num)
	{
		String str = Integer.toString(num);
		for(int i = 0 ; i < str.length()/2 ; i++ )
			if( str.charAt(i) != str.charAt(str.length()-1-i) )
				return false;
		return true;
	}
	
	static public void main(String args[])
	{
		int num = 0;
		boolean flag = false;
		for( int i = 999 ; i >= 100 && !flag ; i-- )
			for( int j = 999 ; j >= 100 ; j-- )
				if( i*j > num && isPalindrome(i*j) )
					num = i*j;
		
		System.out.println(num);
	}

}
