package string.basic.def;

public class Demo1 
{
	public static void main(String[] args)
	{
		String str=new String("hello");
		System.out.println(str);
		//String str2=new String("world");
		String str2=str.concat("world");
		System.out.println(str2);
	}

}
//hello
//helloworld