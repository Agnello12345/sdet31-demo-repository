package objectclass.tostringmethod;

public class DemoToString 
{
	public static void main(String[] args)
	{
		DemoToString d=new DemoToString();
		System.out.println(d.toString());   
		//System.out.println(d);     //by default jvm will invoke tostring() internally so if we give object ref it gives string form of output
		
	}

}
