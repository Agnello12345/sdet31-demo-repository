package method.overloading;

public class Rule1 
{
		public void m1()
		{
			System.out.println("1 st F.A pass");
		}
		public void m1(int x)
		{
			System.out.println("2 nd F.A pass");
		}
		public void m1(int x,int y)
		{
			System.out.println("2 nd F.A pass");
		}
		public static void main(String[] args) 
		{
			Rule1 r=new Rule1();
			r.m1();
			r.m1(10);
			r.m1(10,20);
			
		}
}
