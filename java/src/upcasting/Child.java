package upcasting;

public class Child extends Parent
{
	public void m1()
	{
		System.out.println("child m1 running");
	}
	public void m2()
	{
		System.out.println("child m2 running");
	}

	public void m3()
	{
		System.out.println("child m3 running");
	}

	public void m4()
	{
		System.out.println("child m4 running");
	}

public static void main(String[] args) 
{
	Child c=new Child();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	Parent p=new Child();
	p.m1();
	p.m2();
	p.m3();
	Child C=(Child)p;
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	
}
}
