package stringsLearn;

public class StringAllMethods {
	
	
	public static String reverseString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	
	public static void palindromeCheck(String str)
	{
		
		String rev=reverseString(str);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+" is a palindrome");			
		}
		else
		{
			System.out.println(str+" is not a palindrome word");
		}		
		
	}
	
	public static void duplicateFirstCharacterCheck(String str)
	{
		char c=str.charAt(0);
		int f=str.indexOf(c);   
		int l=str.lastIndexOf(c);  
		
		if(f==l)
		{
			System.out.println(c+" is not getting duplicated in the word "+str);
		}
		else
		{
			System.out.println(c+" is getting duplicated in the word "+str);
		}
		
	}
	
	public static void characterOccurance(String str)
	{
	int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(0)==str.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
