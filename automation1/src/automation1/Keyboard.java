package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =browser.openbrowser("https://demoqa.com/text-box");
	 
	 WebElement userName=driver.findElement(By.xpath("//input [@id='userName']"));
	 userName.sendKeys("amrat");
	 
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.TAB);
	 action.sendKeys("amrat@gmail.com");
	 action.build().perform();
	 
	 action.sendKeys(Keys.TAB);
	 action.sendKeys("ukhali bk parbhani");
	 action.build().perform();
	 
	 
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("a");
	 action.keyUp(Keys.CONTROL);
	 action.build().perform();
	 
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("c");
	 action.keyUp(Keys.CONTROL);
	 action.build().perform();
	 
	 action.sendKeys(Keys.TAB);
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("v");
	 action.keyUp(Keys.CONTROL);
	  action.sendKeys(Keys.TAB);
	  action.click();
	 action.build().perform();
	 
	 
	 
	}

}
