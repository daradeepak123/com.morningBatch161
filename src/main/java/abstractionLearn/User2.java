package abstractionLearn;

import java.util.Scanner;

public class User2 {
	static Car c;
	public static void main(String[] args) {
		System.out.println("enter your budget");
		Scanner sc=new Scanner(System.in);
		int budget=sc.nextInt();
		
		if(budget<1000000)
		{
			c=new Maruthi();
		}
		else if(budget>=1000000 & budget<5000000 )
		{
			
			c=new Ford();
		}

		
		else
		{
			c=new Benz();
		}
		
		c.doors4();
		
		
		
	}

}
