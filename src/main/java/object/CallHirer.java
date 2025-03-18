package object;

public class CallHirer {
	
	static int abc=100;
	
	int x=1000;
	String name="quality thought";
	String address="Hyderabad";
	static CallHirer o1=new CallHirer();
	
	public static void hello()
	{
		CallHirer.abc=10000;
		
		CallHirer o=new CallHirer();
		o.name="QT";
		o.address="hyd";
		System.out.println(o.name);          // QT
		System.out.println(o.address);       // hyd
		
		o1.name="hello";
		o1.address="hhyd";		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(abc);   //100
		
		hello();
		
		CallHirer oo=new CallHirer();
		System.out.println(oo.name);       
		System.out.println(oo.address);	  
		
		
		System.out.println(o1.name);
		System.out.println(o1.address);
		
				
	}

}
