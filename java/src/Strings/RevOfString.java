package Strings;

public class RevOfString {

	public static void main(String[] args) {
	
		String s="Shobha";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		
		}
		if(s==rev)
		{
			System.out.println("s is a palindrome");
		}
		else
		{
			System.out.println("s is not a palindrome");
		}
	}

}
