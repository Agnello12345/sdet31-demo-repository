package stringsimportantprog;

import java.util.LinkedHashSet;

public class Printindexofallthecharachters {
public static void main(String[] args) {
	String s="testyantra";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
	for(Character ch:hs)
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				System.out.println(ch+"  position  "+i);
				
				
			}
		}
	}
	
}
}