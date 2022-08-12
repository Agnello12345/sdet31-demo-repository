package Strings;

import java.util.HashSet;

public class OccurenceOfStringWords 
{
	public static void main(String[] args) 
	{
		String s = "khatam ta ta ta ta bye bye bye";
		System.out.println(s.length());
		String[] str = s.split(" ");
		System.out.println(str.length);
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<str.length;i++) 
		{
		hs.add(str[i]);
		}
		for(String string:hs)
			
		{
			int count=0;
			for(int i=0;i<str.length;i++)
		
			{
				if(string.equals(str[i])) {
					count++;
				}
			}
		
			System.out.println(string+" "+count);
		}
		}
	
	
}
