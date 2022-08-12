package array;

public class Sample 
{
	public static void main(String[] args)
	{
		String s="j@123a@!456a@va";
		String ch="";
		String spl="";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<=9)
			{
				num=num+s.charAt(i);
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ch=ch+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}
		}
		System.out.println(ch);
		System.out.println(spl);
		System.out.println(num);
		}}
