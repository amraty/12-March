package automation1;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class webelementmethods
{
	
	 public static void main(String[] args)
     { 
		 
     	
		 WebDriver driver=browser.openbrowser("https://humanloop2.nvda.ai/ui/scene-labeler/jobs");
		
     	 WebElement radio4  =driver.findElement(By.xpath("//span[@class='button-text']"));
     	radio4.click();
         //boolean    result= radio4.isSelected();
         //System.out.println(result);
    // boolean result1=radio4.isDisplayed();
     //    System.out.println(result1);
}}
