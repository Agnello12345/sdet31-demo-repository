package polymorphism.oops;

public class Mainmtdoverld 
{
public static void main()
{
	System.out.println("m1 run");
}
public static void main(int x)
{
	System.out.println("int run");
}
public static void main(String s)
{
	System.out.println("string run");
}
public static void main(String[] args) 
{
	main();
	main(10);
	main("hello");

}
}
