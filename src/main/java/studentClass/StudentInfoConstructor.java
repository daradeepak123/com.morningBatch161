package studentClass;

public class StudentInfoConstructor {
	
	int sid;
	String name;
	int age;
	String gender;
	String phno;
	String address;
	static int fee=20000;
	static String instute="Quality thought";
	
	StudentInfoConstructor(int ssid,String sname,int sage,String sgender,String sphno,String saddress)
	{
		sid=ssid;
		name=sname;
		age=sage;
		gender=sgender;
		phno=sphno;
		address=saddress;
		
	}
	
	public void displayDetails()
	{

		System.out.println("Student id:         "+sid);
		System.out.println("Student name:       "+name);
		System.out.println("Student age:        "+age);
		System.out.println("Student gender:     "+gender);
		System.out.println("Student phone number"+phno);
		System.out.println("Student address:    "+address);
		System.out.println("Fee is              "+fee);
		System.out.println("Learning in         "+instute);
		System.out.println("-------------------------------------------------");
	}
	

	public static void main(String[] args) {
		StudentInfoConstructor o=new StudentInfoConstructor(101,"Ram",21,"male","9999999999","hyderabad");
		
		o.displayDetails();
		StudentInfoConstructor o1=new StudentInfoConstructor(102,"Krish",22,"male","9999999998","hyderabad");
		o1.displayDetails();
	}

}
