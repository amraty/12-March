package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

public static  WebDriver chromebrowser()
		
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
	     return driver ;// to use this driver in onther class we have to give return type for this method
		
	
	}

}
