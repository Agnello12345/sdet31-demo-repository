package method.recursion;

public class Factorial 
{
	int fact=1;
	int num=1;
	public int Fact(int factor)
	{
		if(num<=factor)
		{
			fact=fact*num;
			num++;
			Fact(factor);
		}
		return fact;
		
		
	}
	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		int ans=f.Fact(5);
		System.out.println(ans);
		
		
	}

}
