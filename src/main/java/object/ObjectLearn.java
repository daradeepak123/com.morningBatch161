package object;

public class ObjectLearn {
	
	int a=100;
	boolean bool=true;
	static String str="QT";

	public static void main(String[] args) {
		System.out.println(str);
		
		ObjectLearn obj=new ObjectLearn();
		obj.a=10000;
		obj.bool=false;
		System.out.println(obj.a);
		System.out.println(obj.bool);
		
		str="Quality thought";
		
		System.out.println(str);
		

	}

}
