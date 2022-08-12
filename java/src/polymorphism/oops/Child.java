package polymorphism.oops;

public class Child extends Parent
{
	public void marriage()
	{
		System.out.println("rashmika");
	}
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.flat();
		p.gold();
		p.marriage();
		Child c=new Child();
		c.flat();
		c.gold();
		c.marriage();
		
		
		
	}

}

