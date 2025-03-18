package studentClass;

public class ConstructorLearn {
	
	int a=100;
	
	ConstructorLearn(int aa)
	{
		a=aa;
	}
	

	public static void main(String[] args) {
	
		ConstructorLearn o=new ConstructorLearn(5000);
		System.out.println(o.a);
		
		ConstructorLearn o1=new ConstructorLearn(10000);
		System.out.println(o1.a);
		
		ConstructorLearn o2=new ConstructorLearn(20000);
		System.out.println(o2.a);
		
		
	}

}
