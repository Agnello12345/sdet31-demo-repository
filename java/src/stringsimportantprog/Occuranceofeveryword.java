package stringsimportantprog;

public class Occuranceofeveryword {
public static void main(String[] args) {
	String s="khatam ta ta bye bye ";
	String[] str = s.split(" ");
	System.out.println(str.length);
	for(int i=0;i<str.length;i++)
	{
		int count=0;
		for(int j=0;j<str.length;j++)
		{
			if(str[i].equals(str[j])&&i>j)
			{
				break;
			}
		else if(str[i].equals(str[j]))
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println(str[i]+" present "+ count+ " time");
		}
	}
}
}
