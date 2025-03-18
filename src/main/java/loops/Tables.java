package loops;

import java.util.Scanner;

public class Tables {
	
	public static void table(int tab)
	{
		for(int i=1;i<=20;i++)
		{
			//2*1=2
			System.out.println(tab+"*"+i+"="+i*tab);
//			System.out.println(i*5);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired table");
		int tab=sc.nextInt();
		table(tab);
	

	}

}
