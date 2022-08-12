package string.basic.def;

public class Demo2 
{
int x=10;

	public static void main(String[] args) 
	{
		
		final Demo2 d=new Demo2();
		System.out.println(d.x);
		
		d.x=20;
		System.out.println(d.x);
		
		//d=new Demo2;         compile time error
		
	 
		
		
	}

}


//we can make only object reference as final..
//10 if we make any object reference as final than that refernce cant be pointed to any other object.