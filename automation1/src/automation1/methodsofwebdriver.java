package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsofwebdriver 
         {
	
	public static void main (String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.youtube.com");
		String a=driver.getTitle();           //  output is like  youtube name of page
        System.out.println(a);                //  url of current page https://www.youtube.com/
     String b = driver.getCurrentUrl();
     System.out.println(b);
           }
	}
