package stringsimportantprog;
public class Numberofconcecutivecharacters {
	public static void main(String[] args) {
		String s="aaaabbbcc";
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char ch1 = s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				char ch2 = s.charAt(j);
				if(ch1==ch2)
				{
					count++;
					i++;
				}
				else
				{
				
					break;
				}
			}
			if(count>0)
			{
				System.out.print(" "+ch1+""+count);
			}
		}
	}

}

