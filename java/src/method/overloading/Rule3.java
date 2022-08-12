package method.overloading;

public class Rule3 
{
	public void m1(int x,String s)
	{
		System.out.println("2 nd F.A pass");
	}
	public void m1(String s,int y)
	{
		System.out.println("3 Rd F.A pass");
	}
	public static void main(String[] args) 
	{
		Rule3 r=new Rule3();
		
		r.m1(10,"agnello");
		r.m1("akhil",20);
		
	}

}
