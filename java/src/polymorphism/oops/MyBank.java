
package polymorphism.oops;

public class MyBank 
{
	public void search(long accnum)
	{
		int acountnum=countdigit(accnum);
		if(acountnum>=11 && acountnum<=16)
		{
			System.out.println("search by using account number");
		}
		else
		{
			System.out.println("invalid account number");
		}
	}
	public void search(long adharnum,String name)
	{
		int adhaarnum=countdigit(adharnum);
		if(adhaarnum==12)
		{
			System.out.println("search by using adhaar number");
		}
		else
		{
			System.out.println("search by using name");
		}
	}
	public void search(long phnum,long accnum)
	{
		int phonenum=countdigit(phnum);
		if(phonenum==11)
		{
			System.out.println("search by mobilenum");
		}
		else
		{
			System.out.println("search by account number");
		}
	}


public int countdigit(long num)
{
	int count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	return count;
}

public static void main(String[] args)
{
	MyBank b=new MyBank();
	b.search(20264844489l);
	b.search(276071967748l,"AGNELLO");
	b.search(9206, 20264844489l);
}
	
}


