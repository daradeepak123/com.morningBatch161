package stringsLearn;

public class CasesCheck {

	public static void main(String[] args) {
	
		String str="This Is JAVA Program";
		int uCase=0;
		int lCase=0;
		for(int i=0;i<str.length();i++)
		{
		if(Character.isUpperCase(str.charAt(i)))
		{
		uCase++;
		}
		else
		{
		lCase++;
		}
		}

		System.out.println(uCase);
		System.out.println(lCase);
		
		System.out.println(uCase+lCase);
		System.out.println(str.length());
		

	}

}
