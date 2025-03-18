package stringsLearn;

import java.util.Scanner;

public class FirstCharacterDupCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired string");
		String str=sc.next();
		
		StringAllMethods.duplicateFirstCharacterCheck(str);

	}

}
