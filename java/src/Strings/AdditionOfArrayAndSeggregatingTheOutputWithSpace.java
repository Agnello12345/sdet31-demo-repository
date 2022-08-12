package Strings;

public class AdditionOfArrayAndSeggregatingTheOutputWithSpace 
{
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {9,9,9};
		int temp=0;
		int rem=0;
		int quotient=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				temp=a[i]+b[j];
				if(temp>9)
				{
					quotient=temp/10;

					rem=temp%10;
								}
			}
			System.out.print( " "+quotient+" "+ rem);
		
		
	}
		
	}


}
