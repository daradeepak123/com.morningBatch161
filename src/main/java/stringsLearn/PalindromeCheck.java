package stringsLearn;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired String");
		String str=sc.next();
		StringAllMethods.palindromeCheck(str);

	}

}
