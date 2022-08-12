package string.basic.def;

public class StringClassMethods 
{
	public static void main(String[] args)
	{
		String s=" maha BHARAT ";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//System.out.println(s.charAt(14));
		System.out.println(s.indexOf('R'));	
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('z'));
		System.out.println(s.lastIndexOf('A'));
		System.out.println(s.lastIndexOf('a'));	
		System.out.println(s.replace("maha", "raja"));
		System.out.println(s.replace("zzzz","aaaa"));
		System.out.println(s.replace('z','a'));
		System.out.println(s.replace('a', 'o'));
		System.out.println(s.trim());
		System.out.println(s.substring(1));
		//System.out.println(s.substring(19));
		System.out.println(s.substring(0, 11));
		//System.out.println(s.substring(0, 20));
		
		
		
	}

}
