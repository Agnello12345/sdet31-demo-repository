package inheritance.oops;

public class Teacher extends Person
{
	int salary;
	String subject;
	Teacher(String name,int age,int salary,String subject)
	{
		super(name,age);
		this.salary=salary;
		this.subject=subject;
		
	}
	public void Teacherinfo()
	{
		System.out.println("teacher name:" +name);
		System.out.println("teacher age is" +age);
		System.out.println("teacher salary is" +salary);
		System.out.println("teacher teaches" +subject);
	}
	
public static void main(String[] args) 
{
	Teacher t=new Teacher("anu",30,2000,"java");
	t.Teacherinfo();
	Player p=new Player("sachin",45,"india","cricket");
	p.Playerinfo();
	
}
}
