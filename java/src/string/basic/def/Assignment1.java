package string.basic.def;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		String s=" java is a easy programming language";
		System.out.println("Given string with spaces in between:" +s);
		s.trim();
		System.out.println("String with no spaces in between:______________"   +s.replace(" ",""));
		
		
	}

}
