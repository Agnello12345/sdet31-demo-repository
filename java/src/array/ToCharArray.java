package array;

public class ToCharArray
{
//program to find the length of the string by converting string to array
	public static void main(String[] args) 
	{
		String s="selenium";
		char[] ch=s.toCharArray();
		int count=0;
		for(char i:ch)
		{
			System.out.println(i);
			count++;
		}
		System.out.println("length of the string is:" +count);
		
	}
}
