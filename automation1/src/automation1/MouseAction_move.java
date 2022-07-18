package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_move {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=browser.openbrowser("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action =new Actions(driver);
		 Thread.sleep(3000);
		action.moveToElement(signin);
	}

}
