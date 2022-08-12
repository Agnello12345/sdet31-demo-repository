package stringsimportantprog;

public class Occuranceofduplicatecharacters {
	public static void main(String[] args) {
		String s="testyantra";
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2&&i>j)
				{
					break;
				}
				else if(ch1==ch2)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch1+" present "+count+" time ");
			}
		}
		

	}
	

}
