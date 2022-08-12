package Strings;

import java.util.LinkedHashSet;

public class VowelsPrgStrgWithoutDup 
{
	public static void main(String[] args) 
	{
		String s="india";
		int count=0;
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character ch:lhs)
		{
				if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') 
				{
					count++;
					
				}
			}
			
		
		System.out.println(s+ " equals to "+count);
		
		
	}

}
