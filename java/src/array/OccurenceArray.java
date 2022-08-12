
package array;

public class OccurenceArray 
{
	public static void main(String[] args)
	{
		int[] x= {24,34,24,12,13,12,34, 24};
		int n=x.length;
		int[] occ = new int[n];
		int flag=-1;
		for(int i=0;i<x.length;i++)
		{
			int count=1;	
			for(int j=i+1;j<x.length;j++)
			{
				
				if(x[i]==x[j])	{
					count++;
					occ[j]=flag;
				}
			}
			if(occ[i]!=flag)
				occ[i]=count;
			
		}
		System.out.println("========================");
		for(int i=0; i<occ.length; i++) {
			if(occ[i]!=flag)
			System.out.println(x[i]+" "+occ[i]);
		}
	}
}