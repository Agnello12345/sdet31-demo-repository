package method.recursion;

public class NumPrint 
{
int num=1;
public void Print()
{
	if(num<=100)
	{
	System.out.println(num);
	num++;
	Print();
	}

}
public static void main(String[] args) 
{
	NumPrint n=new NumPrint();
	n.Print();
	
}

}