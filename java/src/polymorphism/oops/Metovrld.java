package polymorphism.oops;

public class Metovrld 
{
	public static void m1()
	{
		System.out.println("m1 without arg");
	
	}
	public int m1(int x)
	{
		System.out.println("int arg");
		return 2000;
	
	}
	public void m1(int x,int y)
	{
		System.out.println("dual int arg");
	}
	public void m1(String s)
	{
		System.out.println("string arg");
	}
	public static void main(String[] args) 
	{
		Metovrld m=new Metovrld();	
		m1();
		System.out.println(m.m1(10));
	
		m.m1(20,30);
		m.m1("akil");
		
		
	}
}
