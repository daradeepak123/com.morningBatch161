package constructors;

public class ConstructorLearn {
	int a;
	int b;
	
	ConstructorLearn()
	{
		a=600;
		b=500;
	}
	
	
	

	public static void main(String[] args) {
		ConstructorLearn o=new ConstructorLearn();
		System.out.println(o.a+o.b);
	}

}
