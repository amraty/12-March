package automation1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser
{
	public static  WebDriver openbrowser( String url)
		
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
	     return driver ;// to use this driver in onther class we have to give return type for this method
		
	
	}

}
