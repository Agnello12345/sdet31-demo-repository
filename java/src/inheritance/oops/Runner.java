package inheritance.oops;

public class Runner 
{
	public static void main(String[] args) 
	{
		C obj=new C();//normal
		obj.test();
		obj.run();
		obj.demo();
	
		B obj1=new C();//upcasting
		obj1.test();
		obj1.run();
	
		C obj2=(C)obj1;
		obj2.test();
		obj2.run();
		obj2.demo();
	}

}
