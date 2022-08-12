package supr.tiskeyword;

public class Test extends Demo
{
	int x=100;
	public void m1(int y)
	{
		System.out.println(super.x);
		super.m1();
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1(1000);
		
	}

}
