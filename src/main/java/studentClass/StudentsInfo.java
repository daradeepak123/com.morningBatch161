package studentClass;

public class StudentsInfo {
	
	int sid;
	String name;
	int age;
	String gender;
	String phno;
	String address;
	static int fee=20000;
	static String instute="Quality thought";
	
	
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
	
	public void details(int ssid,String sname,int sage,String sgender,String sphno,String saddress)
	{
		sid=ssid;
		name=sname;
		age=sage;
		gender=sgender;
		phno=sphno;
		address=saddress;
	}


	public static void main(String[] args) {
	
		
		StudentsInfo s=new StudentsInfo();
		s.details(101, "Ram", 22, "male", "999999999", "hyderabad");
		s.displayDetails();
		
		StudentsInfo s1=new StudentsInfo();
		s1.details(102, "Krish", 21, "male", "999999998", "hyderabad");
		s1.displayDetails();
		
		StudentsInfo sn=new StudentsInfo();
		s.details(103, "Hello", 22, "male", "999999997", "hyderabad");
		sn.displayDetails();
		
		
		

	}

}
