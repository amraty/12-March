package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOCATERS
          { 
	           public static void main(String[] args){
	        	   WebDriver driver=browser.openbrowser("https://vctcpune.com/");
	        	   
	        	   
	        	// WebElement email  =driver.findElement(By.id("email"));
	        	          // email.sendKeys("amratyadav96@gmail.com");          // sendKeys is use to enter value in webpage element/field
	        	 
	        	 
	        	// WebElement pass  =driver.findElement(By.id("pass"));
	        	          //  pass.sendKeys("amrat");
	        	           
	        	  // WebElement  button = driver.findElement(By.cssSelector("button[value='1']"));
	        	    //        button.click();                  // it is just do click 
	        	             
	        	             
	        	         //    WebElement  pass = driver.findElement(By.className("_6luy _55r1 _1kbt _9nyi"));
	        	          //   pass.sendKeys("amrat");  
	        	             
	        	          //   WebElement  email = driver.findElement(By.xpath("//a[contains(@href,'https://vctcpune.com/selenium/practice.html')]"));
		        	        //    email.click(); 
	        	   WebElement email  =driver.findElement(By.xpath("//body//header//ul//li[3]"));
     	          email.click(); 
		        	            
	        	           
	        	             
	        	             
	        	           
	        	           
	        	           
	        	 
	        	 
	        	 
				
			}

}
