package Strings;

import java.util.HashSet;

public class OccurenceProgram 
{
	public static void main(String[] args) 
	{
		String s="SATELLITE";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character ch:hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
			  if(ch.equals(s.charAt(i)))
				{
				 // System.out.print(ch);
					count++;
				}
			 
			}
			
			System.out.println(ch+" is occuring "+count);
		}
}
}
