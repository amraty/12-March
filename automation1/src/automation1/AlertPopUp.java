package automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopUp 
      {
	
	 public static void main(String[] args) throws InterruptedException 
	 {  
		 WebDriver  driver=browser.openbrowser("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement alertbox= driver.findElement(By.xpath("//button [@name='promptalertbox1234']"));
		alertbox.click();
		Alert a=driver.switchTo().alert();
	
		 // String s=a.getText();
		 // System.out.println(s);
		  
		           //a.accept();
		          //a.dismiss();
		           a.sendKeys("mansoon comming soon");
		           
		           Thread.sleep(3000);
		           a.accept();
		        
		           
		           
		           
	}

}
