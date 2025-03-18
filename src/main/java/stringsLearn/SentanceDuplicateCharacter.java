package stringsLearn;

public class SentanceDuplicateCharacter {

	public static void main(String[] args) {
		String str="mom and dad are going to meet madam";


		String word[]=str.split(" ");

		for(String s:word)
		{
		StringAllMethods.duplicateFirstCharacterCheck(s);
		}


	}

}
