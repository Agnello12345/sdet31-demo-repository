package method.overloading;

public class Rule2 
{
	
	public void m1(int x,String s)
	{
		System.out.println("2 nd F.A pass");
	}
	public void m1(int x,int y)
	{
		System.out.println("3 Rd F.A pass");
	}
	public static void main(String[] args) 
	{
		Rule2 r=new Rule2();
		
		r.m1(10,"HELLO");
		r.m1(10,20);
		
	}

}
