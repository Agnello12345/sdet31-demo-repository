package encapsulation.oops;

public class Sample 
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(t.getX());
		System.out.println(t.getName());
		t.setX(20);
		System.out.println(t.getX());
		t.setName("agnello fernandes");
	    System.out.println(t.getName());
		
		
	}

}
