package array;

public class RevArray 
{
	public static void main(String[] args) 
	{
		int[]x= {12,24,11,30};
		int[]revarr=new int[x.length];
		int count=0;
		for(int i=x.length-1;i>=0;i++)
		{
			revarr[count++]=x[i];
			
		}
		System.out.println("reverse array");
		for(int z:revarr)
		{
			System.out.println(z+" ");
		}
		
		
	}

}
