package stringsLearn;

public class PanindromeWordsCheck {

	public static void main(String[] args) {
		String sentence = "mom and dad are going to meet madam";
		
		String words[]=sentence.split(" ");
		int count=0;
		for(String w:words)
		{
			String rev=StringAllMethods.reverseString(w);
			if(w.equals(rev))
			{
				count++;
				System.out.println(w+ " is a palindrome word");
			}
		}
		System.out.println("in total we have "+count+" words which are palindromes");
		

	}

}
