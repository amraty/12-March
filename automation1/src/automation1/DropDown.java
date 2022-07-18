package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown
    {
	   public static void main(String[] args)
	   {
		    
	        
	        	   WebDriver driver=browser.openbrowser("https://vctcpune.com/selenium/practice.html");
	        	              WebElement  dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	        	  
	        	  Select sel  =new Select(dropdown);
	        	       // sel.selectByIndex(1);        //these are methode of select class
	        	      // sel.selectByValue("option3");
	        	      sel.selectByVisibleText("option2");
	}    

}
