package method.recursion;

public class Pallindrome 
{
	int sum=0;
	public boolean check(int num)
	{
		int rev=revnum(num);
		if(rev==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int revnum(int num)
	{
		if(num!=0)
		{
			int rem = num%10;
			sum=(sum*10)+rem;
			num=num/10;
			revnum(num);
		}
		return sum;
	}
public static void main(String[] args) 
{
	Pallindrome p=new Pallindrome();
	System.out.println(p.check(121));
	
	
}
}
