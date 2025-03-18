package conditions;

import java.util.Scanner;

public class ConditionsLearn {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please ented desired number");
			
		int num=sc.nextInt();
		System.out.println("enter string data");
		String ss=sc.next();
		System.out.println(ss+" THis is string data");
		
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is a odd number");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
