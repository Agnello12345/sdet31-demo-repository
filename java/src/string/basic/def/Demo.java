package string.basic.def;

public class Demo 
{
	public static void main(String[] args) 
	{
		String s=new String("hello");
		System.out.println(s);
		s.concat("world");
		System.out.println(s);
		
	}

}

//we get same output because string object are immutable in nature.
// hello
//hello
