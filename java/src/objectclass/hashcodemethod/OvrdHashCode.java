package objectclass.hashcodemethod;

import oops.concept.override;

public class OvrdHashCode 
{
	public static void main(String[] args) 
	{
	
	DemoHashCode d1=new DemoHashCode();
	DemoHashCode d2=new DemoHashCode();
	DemoHashCode d3=new DemoHashCode();
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	System.out.println(d3.hashCode());
		
	}
	@override
	public int hashCode()
	{
		return 123;
	}

}
//incorrect way of overriding hashcode()