package Strings;

public class RevOfNum 
{
public static void main(String[] args) 
{
	int num=121;
	int rev=0;
	int temp=num;
	while(temp!=0)
	{
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	
	System.out.println(rev);
	
if(num==rev)
{
	System.out.println("pallindrome");
}

else
	
{
	System.out.println("not pallindrome");
}

}
}