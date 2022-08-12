package stringsimportantprog;

import java.util.LinkedHashSet;

public class PositionOfCharacterBasedOnIndex 
{
	public static void main(String[] args) {
		String s="muralil";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		char c='l';
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		System.out.println(s.length());
		int index=0;
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		   lhs.add(s.charAt(i));
		}
			
			for(char ch2:lhs)
			{
				if(c==ch2)
				{
					count++;
					break;
				}
				index++;
			}
			if(count==1)
			{
				System.out.println(c+" present at "+ index);
			}
		}
		
	}


