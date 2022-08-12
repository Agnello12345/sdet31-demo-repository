package Strings;
 

public class OccurenceOfCharPosition 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[]= {9,9,9};
		int count=a.length;
		int sum=0;
		
		for(int i=0;i<count;i++)
		{
			
			
				sum=a[i]+b[i];
				if(sum>9)
				{
					int fnum=sum/10;
					int snum=sum%10;
				
					System.out.print(fnum+ " " +snum);
				}
				
				
				
		}
		
				
		
	}
	}

