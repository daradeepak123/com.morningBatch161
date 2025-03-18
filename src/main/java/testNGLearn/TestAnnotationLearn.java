package testNGLearn;

import org.testng.annotations.Test;

public class TestAnnotationLearn {
	
	
	@Test(priority = 1,enabled=true)
	public void test4()
	{
		System.out.println("test 4 method");
	}
	
	
	
	@Test(priority = 3,description = "This test is used to login",dependsOnMethods = "test4")
	public void test1()
	{
		System.out.println("test 1 method");
	}
	
	@Test(enabled=true,priority = 2)
	public void test2()
	{
		System.out.println("test 2 method");
	}
	
	
	@Test(priority = 4,invocationCount = 5)
	public void test3()
	{
		System.out.println("test 3 method");
	}

	
	
	
	
	
	

}
