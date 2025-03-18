package stringsLearn;

public class TypeOfCaseCount {

	public static void main(String[] args) {
		String str="this is StRING LE@RnInG_QT @mEerPer";

		int uCase=0;
		int lCase=0;
		int spl=0;

		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				uCase++;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lCase++;
			}
			else
			{
				spl++;
			}
		}

		System.out.println(uCase);
		System.out.println(lCase);
		System.out.println(spl);


	}

}
