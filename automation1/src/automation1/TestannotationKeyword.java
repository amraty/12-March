package automation1;

import org.testng.annotations.Test;

public class TestannotationKeyword {
	
	@Test(priority=1)
	public void test1() 
	{
		
		System.out.println("test1");
	}
	@Test(priority=-1,dependsOnMethods= {"test1"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(invocationCount=5)
	public void test3()
	{
		System.out.println("test3");
		
	}@Test(enabled = false)
	public void test4()
	{
		System.out.println("test4");
	}

	}


