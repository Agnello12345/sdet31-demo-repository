package Strings;

public class OccurenceOfStringAndReverse 
{
	public static void main(String[] args) 
	{
		
		String s = "khatham ta ta bye bye";

		String[] str=s.split(" ");
for(String str1:str)
{
	for(int i=str1.length()-1;i>=0;i--)
	{

		
		System.out.print(str1.charAt(i));
	}
	
	
	System.out.print(" ");
	
}
System.out.println();
	
	}}

