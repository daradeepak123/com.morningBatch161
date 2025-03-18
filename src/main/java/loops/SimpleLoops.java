package loops;

import java.util.Scanner;

public class SimpleLoops {
	
	
	public static void printNumbers(int t)
	{
		for(int i=1;i<=t;i++)
		{
			System.out.println(i);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter last number");
		int t=sc.nextInt();		
		printNumbers(t);
	}

}
