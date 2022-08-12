package Strings;

public class VowelsProgramString 
{
	public static void main(String[] args) 
	{
		String s1="INDIA";
		String s = s1.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.print(s+" equals to " +count);
		
		
	}

}
