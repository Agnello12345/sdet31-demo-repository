package stringsimportantprog;

import java.util.LinkedHashSet;

public class FindIndexOfAllCharactersInAString 
{
	public static void main(String[] args) {
		String s="muralili";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		char[] ch = s.toCharArray();
		int index=0;
		
		for(int i=0;i<ch.length;i++)
		{
		   lhs.add(s.charAt(i));
		}
			
			for(char ch2:lhs)
			{
				
					System.out.println(ch2+" present at "+ index);
					index++;
			}
					}
		


}
