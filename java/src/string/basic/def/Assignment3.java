package string.basic.def;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		String s="education";
		char a='a';
		char b='e';
		char c='i';
		char d='o';
		char e='u';
		if(s.contains("education"))
		{
			
			System.out.println(s.charAt(4)+ "  "  +s.indexOf('a'));
		}
		if(s.contains("education"))
		{
			System.out.println(s.charAt(0)+ "  "  +s.indexOf('e'));
		}
		if(s.contains("education"))
		{
			System.out.println(s.charAt(6)+ "  "  +s.indexOf('i'));
		}
		if(s.contains("education"))
		{
			System.out.println(s.charAt(7)+ "  "  +s.indexOf('o'));
		}
		if(s.contains("education"))
		{
			System.out.println(s.charAt(2)+ "  "  +s.indexOf('u'));
		}
	}
	
	
}

