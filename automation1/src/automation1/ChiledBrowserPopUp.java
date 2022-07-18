package automation1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChiledBrowserPopUp 
        { public static void main(String[] args)
        {
      WebDriver  driver=browser.openbrowser("https://vctcpune.com/");
         WebElement Practice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
                  Practice.click();
                  Practice.click();
                  Practice.click();
                String homepage= driver.getWindowHandle(); // it gives address of current page called as handale
                 System.out.println(homepage);
             Set<String>  handles  =driver.getWindowHandles();// set stores multiple data
                                                              //<String> this is genrics which tell us what kind of data stored in set
                                                              // set dosent save duplicate data
                                                              // set dosent maintain insertion order (unorgnised)
            Iterator<String> i= handles.iterator(); // iterator method return iterator interface 
           String  handles1= i.next();              // by using next method of iterator interface  we can call the value stored in SET
           System.out.println(handles1);
           
           
           String  handles2= i.next();
           System.out.println(handles2);
           
           
           String  handles3= i.next();
           System.out.println(handles3);
		}
       

}
