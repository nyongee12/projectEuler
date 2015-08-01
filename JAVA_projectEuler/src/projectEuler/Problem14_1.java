package projectEuler;

class NumAndCount {
	long number;
	int count;
	
	NumAndCount(long num, int count)
	{
		this.number = num;
		this.count = count;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
}

public class Problem14_1 {
	
	static final int bound = 1000000;

	public static boolean isValid(NumAndCount now)
	{
		long num = now.getNumber();
		int count = now.getCount();
		long odd = (num-1)/3;
		
		boolean flag = true;
		
		if( num > bound )
			if( odd*3+1 == num && odd%2 == 1 ) return true;
		
		if( num*2 > bound )
		{
			if( odd*3+1 == num && odd%2 == 1 )
				return true;
			long next_odd = (num*2-1)/3;
			if( next_odd*3+1 == num*2 && next_odd%2 == 1 )
			{
				if( next_odd > bound ) flag = false;
			}
			else
			{
				long nnext_odd = (num*2*2-1)/3;
				if( nnext_odd*3+1 == num*2*2 && nnext_odd%2 == 1 )
				{
					if( nnext_odd > bound ) flag = false;
				}
				else flag = false;
			}
		}
		if( flag ) return true;
		if( num > bound )
		{
			now.setNumber(num/2);
			now.setCount(count-1);
		}
		return false;
	}
	
	public static NumAndCount calNum(NumAndCount item)
	{	
		long num = item.getNumber();
		int count = item.getCount();
		long odd = (num-1)/3;
		
		if( !isValid(item) ) return item;
		
		
		NumAndCount tmp1 = new NumAndCount(odd,count+1);
		NumAndCount tmp2 = new NumAndCount(num*2,count+1);
		
		if( odd != 1 && odd*3+1 == num && odd%2 == 1 )
			tmp1 = calNum(tmp1);
		else tmp1.setCount(0);
		tmp2 = calNum(tmp2);
		
		
		//System.out.println("num1 : "+ tmp1.getNumber() + " count1 : "+tmp1.getCount());
		//System.out.println("num2 : "+ tmp2.getNumber() + " count2 : "+tmp2.getCount());
		
		if( tmp1.getCount() > tmp2.getCount() ) return tmp1;
		else if( tmp1.getCount() == tmp2.getCount() )
		{
			if( tmp1.getNumber() > tmp2.getNumber() ) return tmp1;
			else return tmp2;
		}
		else return tmp2;
	}

	public static void main(String args[])
	{
		NumAndCount result = new NumAndCount(1,1);
		result = calNum(result);
		
		System.out.println(result.getNumber()+" , "+result.getCount());
		
	}

}
