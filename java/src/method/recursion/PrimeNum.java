package method.recursion;

public class PrimeNum 
{
	int no=1;
	int count=0;
	public int Prime(int num)
	{
		if(no<=num)
		{
			if(num%no==0)
			{
				count++;
			}
			no++;
			Prime(num);
		}
		return count;
		}
	public static void main(String[] args) 
	{
		PrimeNum n=new PrimeNum();
		int ans=n.Prime(7);
		if(ans==2)
		{
			System.out.println("number is a prime number");
			
		}
		else
		{
			System.out.println("number is not a prime number");
		}
		
		
	}
	

}
