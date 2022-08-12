package Strings;

public class RevOfStringWithoutLength {

	public static void main(String[] args) {

		String s="Shobha";
     char[] ch = s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
for(int i=count-1;i>=0;i--)
{
	System.out.println(s.charAt(i));
}
	}

}
