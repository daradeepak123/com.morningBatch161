package basicPackage;

public class WelcomeStudents {
	
	
	
	public static void timings()
	{
		System.out.println("Classes will get started by 7:00AM");
		System.out.println("Classes will end by 8:00AM");
		
	}
	
	public static void techinicalDiscussions()
	{
		System.out.println("We will discuss about core java");
		System.out.println("We will discuss about selenium");
		System.out.println("We will discuss about frameworks");
	}
	public static void endOfStudent()
	{
		System.out.println("---------------------------------");
	}
	
	public static void welcomeStudent(String name)
	{
		System.out.println("Welcome "+name+" , welcome to quality thought");
	}
	
	public static void welcomeInstructions(String name)
	{
		welcomeStudent(name);
		timings();
		techinicalDiscussions();
		endOfStudent();
	}
	
	
	
	

	public static void main(String[] args) {
		
		welcomeInstructions("student1");
		welcomeInstructions("student2");
		welcomeInstructions("student3");
		welcomeInstructions("student4");
		welcomeInstructions("student5");
		welcomeInstructions("studentn");

	}

}
