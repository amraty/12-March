package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.ZerodhaLogInPage;
import pojo.Browser;
import utility.Excel;

public class HomePageTest {
	
	WebDriver driver;
	@BeforeMethod
	
	
	public void openBrowserAndLogintoZerodha() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		driver=Browser.chromebrowser();
		ZerodhaLogInPage zerodhaLogInPageTest = new ZerodhaLogInPage(driver);
		String userId =Excel.getData("testdata", 0, 0);
		String password =Excel.getData("testdata", 1, 0);
		String pin  = Excel.getData("testdata",2,0);
		
		zerodhaLogInPageTest.enterUserId(userId);
		zerodhaLogInPageTest.enterPassword(password);
		zerodhaLogInPageTest.clickOnlogin();
		Thread.sleep(2000);
		zerodhaLogInPageTest.enterPin(pin);
		zerodhaLogInPageTest.clickOncontinue();
	}
	
	@Test
	 public void BuyFromWatchlist() 
	{
		ZerodhaHomePage  zerodhaHomePage= New ZerodhaHomePage(driver);
	}
		
	
	

}
