package automation1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChiledBrowserPopUp1 

                {  
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver  driver=browser.openbrowser("https://vctcpune.com/");
         WebElement Practice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
                  Practice.click();
                  Practice.click();
                  Practice.click();
               
                Set<String>  handles =driver.getWindowHandles();// set stores multiple data
                                                              //<String> this is genrics which tell us what kind of data stored in set
                                                              // set dosent save duplicate data
                                                              // set dosent maintain insertion order (unorgnised)
            Iterator<String> i= handles.iterator();
            while(i.hasNext())
            {
            	Thread.sleep(3000);
            	           String handle =i.next();
            	           driver.switchTo().window(handle);
            	         String title= driver.getTitle();
            	    if (title.equals("Practice Page")) 
            	    {
            	    	 WebElement radio2=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
            	    	 radio2.click();
            	    } 
            	
            }
	}

}
