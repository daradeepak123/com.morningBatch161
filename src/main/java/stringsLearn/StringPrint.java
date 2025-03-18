package stringsLearn;

public class StringPrint {

	public static void main(String[] args) {
		String str="Quality thought";

		System.out.println(str);

		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

		System.out.println();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		
	}

}
