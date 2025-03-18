package returnLearn;

import calc.CalculatorLearn;

public class Methodreturn {

	
	public static String printNameReturn()
	{
		
		String str="Welcome to Java";
		
		return str;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String abc="Ram, "+printNameReturn();
		System.out.println(abc);
		System.out.println(printNameReturn());
		
		CalculatorLearn o=new CalculatorLearn();
		int aa=o.add(100, 2000);
		System.out.println(aa);
		
		aa=o.add(aa, 2000);
		System.out.println(aa);
		
		System.out.println(o.ret(aa));
		
	}

}
