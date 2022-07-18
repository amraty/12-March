package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation1.Parameterization;

public class TestNgAnnotationDataProvider {
	
	String value1;
	String value2;
	@BeforeClass
	public void getTestdata() throws EncryptedDocumentException, IOException {
		value1=Parameterization.getData("testdata", 0, 0);
		value2=Parameterization.getData("testdata", 1, 0);
}
	
	@DataProvider (name="Testdata")
	public Object[][] values()  {
		return new Object[][] {{1,2},{2,3},{3,4}};
	}
	
	@Test(dataProvider="Testdata")
	public void test1(int a,int b) 
	{
	System.out.println(a+b);
	}
	
    @DataProvider( name="NewData")
    public Object[][] Values()	{
	return new  Object[][] {{value1},{value2},};
}
    @Test(dataProvider="NewData")
    public void test2 (String name) {
    	System.out.println(name);
    	
    }
}
	
	

