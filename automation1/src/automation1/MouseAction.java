package automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=browser.openbrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ri8click =driver.findElement(By.xpath("//span[text()='right click me']"));
		 Actions action= new Actions(driver);
		 action.contextClick(ri8click);
		 action.perform();
	
		 WebElement 	edit=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
	     edit.click();
	     Thread.sleep(3000);
	     Alert a =driver.switchTo().alert();
	     a.accept();
	     
	     WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	     action.doubleClick(doubleclick);
	     action.perform();
	     Thread.sleep(3000);
	     Alert b =driver.switchTo().alert();
	     b.accept();
	}

}
