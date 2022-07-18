package automation1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotation {
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("beforeTest");
	}
	
	
	
	
	
	
	
	
	

}
