package methodWithParameters;

public class Calculator {
	
	public void add(int a,int b)
	{
		int x=a, y=b;
		int xy=x+y;
		System.out.println(xy);
	}
	
	public void add(int aa,int bb,int cc)
	{
		int x=aa, y=bb;
		int xy=x+y;
		System.out.println(xy);
		System.out.println("this is 2 add method");
	}
	

	
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		
		c.add(100, 100);
		c.add(1000, 100,1000);
		
		
	}
	
	

}
