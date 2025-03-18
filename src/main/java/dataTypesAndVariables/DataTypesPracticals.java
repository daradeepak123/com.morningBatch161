package dataTypesAndVariables;

public class DataTypesPracticals {
	
	public static void printByteValue()
	{
		byte b=100;
		System.out.println(b);
	}
	
	public static void printShort()
	{
		short s=4000;
		System.out.println(s);     //  3000        4000   5
		s=3000;
		System.out.println(s);		// 3000  3       4000 1
		
	}
	
	public static void main(String args[])
	{
		printByteValue();
		printShort();	
		byte b=100;
		
		int i=30;
		System.out.println(i);
		i=b;
		System.out.println(i);
		
		
		
		
	}

}
