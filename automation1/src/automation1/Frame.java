package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
	public static void main(String[] args){
		 WebDriver driver =browser.openbrowser("https://vctcpune.com/selenium/practice.html");
		//driver.switchTo().frame(0);                   // by index
		// driver.switchTo().frame("courses-iframe");    //by id here just put the attribut value of id attribute
		 
		WebElement iframe= driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.manage().window().maximize();
		driver.switchTo().frame(iframe);
        WebElement  course =driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
        course.click();
	}
	
	

}
