package conditions;

import java.util.Scanner;

public class ElectricityBilling {


	public void eleBilling(int units, String type, String name)
	{
		if(type.equals("home")) {
			if(units >0 & units<200)
			{
				System.out.println(name+", you have to pay "+units*2);
			}
			else if(units >=200 & units<400)
			{
				System.out.println(name+", you have to pay "+units*4);
			}
			else if(units >=400 & units<600)
			{
				System.out.println(name+", you have to pay "+units*7);
			}
			else if(units >=600)
			{
				System.out.println(name+", you have to pay "+units*10);
			}
		}
		else if(type.equals("commercial")) {
			if(units >0 & units<200)
			{
				System.out.println(name+", you have to pay "+units*5);
			}
			else if(units >=200 & units<400)
			{
				System.out.println(name+", you have to pay "+units*8);
			}
			else if(units >=400 & units<600)
			{
				System.out.println(name+", you have to pay "+units*10);
			}
			else if(units >=600)
			{
				System.out.println(name+", you have to pay "+units*15);
			}
		}
		else if(type.equals("industries")) {
			if(units >0 & units<200)
			{
				System.out.println(name+", you have to pay "+units*5);
			}
			else if(units >=200 & units<400)
			{
				System.out.println(name+", you have to pay "+units*8);
			}
			else if(units >=400 & units<600)
			{
				System.out.println(name+", you have to pay "+units*10);
			}
			else if(units >=600)
			{
				System.out.println(name+", you have to pay "+units*15);
			}
		}
		

	}



	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter your name");
		String name=sc.next();
		
		System.out.println("enter type of usage home/commercial/industries");
		String type=sc.next();

		System.out.println("mr/ms "+name+" please enter your last month reading");
		int lMonthReading=sc.nextInt();
		int cMonthReading=0;
		
		do {
			
			System.out.println("mr/ms "+name+" please enter your current month reading and it should be greater than last month reading "+lMonthReading);
			cMonthReading=sc.nextInt();
		}while(cMonthReading<lMonthReading);

		

		int units=cMonthReading-lMonthReading;
		System.out.println(units);

		ElectricityBilling o=new ElectricityBilling();

		o.eleBilling(units, type, name);

	}

}
