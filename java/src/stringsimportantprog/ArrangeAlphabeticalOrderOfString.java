package stringsimportantprog;

public class ArrangeAlphabeticalOrderOfString 
{
	public static void main(String[] args) {
		String s="AGNELLO FERNANDES";  //HOW TO AVOID DUPLICATES
		char[] ch = s.toCharArray();
		char temp=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					 temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
			System.out.println(ch);
		
	}


}
