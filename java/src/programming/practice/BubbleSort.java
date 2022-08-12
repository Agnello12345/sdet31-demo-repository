
package programming.practice;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,20,6,40,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int z:a)
		{	
			System.out.println(z);
		}
		System.out.println(a[0]);
		
		System.out.println(a[a.length-1]);
		
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int z:a)
		{
			System.out.println(z);
		}
}
}
