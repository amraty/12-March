package automation1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChiledBrowserPopUPArrayList 

	
	
	{
	public static void main(String[] args) throws InterruptedException
    {
  WebDriver  driver=browser.openbrowser("https://vctcpune.com/");
     WebElement Practice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
              Practice.click();
              Thread.sleep(3000);
              Practice.click();
              Thread.sleep(3000);
              Practice.click();
              Thread.sleep(3000);
              Practice.click();
              
              ArrayList<String> list= new        ArrayList<String> (driver.getWindowHandles());
            int  s= list.size();
            System.out.println(s);
            driver.switchTo().window(list.get(0));
            System.out.println(driver.getTitle());
            Thread.sleep(3000);
            driver.switchTo().window(list.get(1));
            System.out.println(driver.getTitle());
            Thread.sleep(3000);
            driver.switchTo().window(list.get(2));
            System.out.println(driver.getTitle());
            Thread.sleep(3000);
            driver.switchTo().window(list.get(3));
            System.out.println(driver.getTitle());
            driver.switchTo().window(list.get(4));
            System.out.println(driver.getTitle());
            
            
              
    }

}
